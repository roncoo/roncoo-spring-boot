package com.roncoo.spring.boot.autoconfigure.fastdfs;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wujing
 */
@Configuration
@EnableConfigurationProperties(FastdfsProperties.class)
@ConditionalOnProperty(name = "fastdfs.enabled", matchIfMissing = true)
public class FastdfsAutoConfiguration {

    private final FastdfsProperties properties;

    public FastdfsAutoConfiguration(FastdfsProperties properties) {
        this.properties = properties;
    }

    @Bean
    @ConditionalOnMissingBean(FastdfsClientService.class)
    public FastdfsClientService fastdfsClientService() throws Exception {
        return new FastdfsClientService(properties);
    }

}
