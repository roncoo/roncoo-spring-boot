package com.roncoo.spring.boot.autoconfigure.fastdfs;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.roncoo.fastdfs.StorageClient;

/**
 * 
 * @author wujing
 */
@Configuration
@ConditionalOnClass(StorageClient.class)
@EnableConfigurationProperties(FastdfsProperties.class)
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
