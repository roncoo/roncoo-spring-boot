package com.roncoo.spring.boot.autoconfigure.minio;

import io.minio.MinioClient;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wujing
 */
@Configuration
@EnableConfigurationProperties(MinioProperties.class)
@ConditionalOnProperty(name = "minio.enabled", havingValue = "true")
public class MinioAutoConfiguration {

    private final MinioProperties properties;

    public MinioAutoConfiguration(MinioProperties properties) {
        this.properties = properties;
    }

    @Bean
    @ConditionalOnMissingBean(MinioClient.class)
    public MinioClient minioClient() {
        //创建minio对象
        return MinioClient.builder().endpoint(properties.getEndpoint()).credentials(properties.getAccessKey(), properties.getSecretKey()).build();
    }

}
