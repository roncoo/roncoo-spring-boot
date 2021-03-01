package com.roncoo.spring.boot.autoconfigure.minio;

import io.minio.BucketExistsArgs;
import io.minio.MakeBucketArgs;
import io.minio.MinioClient;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

/**
 * @author wujing
 */
@Configuration
@ConditionalOnClass(MinioClient.class)
@EnableConfigurationProperties(MinioProperties.class)
@ConditionalOnProperty(name = "minio.enabled", matchIfMissing = true)
public class MinioAutoConfiguration {

    private final MinioProperties properties;

    public MinioAutoConfiguration(MinioProperties properties) {
        this.properties = properties;
    }

    @Bean
    @ConditionalOnMissingBean(MinioClient.class)
    public MinioClient minioClient() {
        //创建minio对象
        MinioClient minioClient = MinioClient.builder().endpoint(properties.getEndpoint()).credentials(properties.getAccessKey(), properties.getSecretKey()).build();
        if (StringUtils.hasText(properties.getBucketname())) {
            try {
                if (!minioClient.bucketExists(BucketExistsArgs.builder().bucket(properties.getBucketname()).build())) {
                    minioClient.makeBucket(MakeBucketArgs.builder().bucket(properties.getBucketname()).build());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return minioClient;
    }

}
