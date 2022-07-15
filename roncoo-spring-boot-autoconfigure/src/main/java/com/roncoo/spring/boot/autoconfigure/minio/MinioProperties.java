package com.roncoo.spring.boot.autoconfigure.minio;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author wujing
 */
@ConfigurationProperties(prefix = "minio")
public class MinioProperties {

    /**
     * 是否启用MinIO
     **/
    private Boolean enabled = false;
    /**
     * endpoint
     **/
    private String endpoint = "localhost";
    /**
     * accessKey
     **/
    private String accessKey = "";
    /**
     * secretKey
     **/
    private String secretKey = "";

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

}
