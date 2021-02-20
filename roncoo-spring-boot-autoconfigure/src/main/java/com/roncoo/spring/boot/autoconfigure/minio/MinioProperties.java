package com.roncoo.spring.boot.autoconfigure.minio;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author wujing
 */
@ConfigurationProperties(prefix = "minio")
public class MinioProperties {

    // endpoint
    private String endpoint = "localhost";
    // port
    private Integer port = 9000;
    // accessKey
    private String accessKey = "";
    // secretKey
    private String secretKey = "";
    // bucketname
    private String bucketname = "";

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
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

    public String getBucketname() {
        return bucketname;
    }

    public void setBucketname(String bucketname) {
        this.bucketname = bucketname;
    }
}
