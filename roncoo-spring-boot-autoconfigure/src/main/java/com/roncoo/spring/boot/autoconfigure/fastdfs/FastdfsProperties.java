package com.roncoo.spring.boot.autoconfigure.fastdfs;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author wujing
 */
@ConfigurationProperties(prefix = "fastdfs")
public class FastdfsProperties {

    // 是否启用FastDFS
    private Boolean enabled;

    // Nginx服务器IP，多个使用分号分割
    private String nginxServers = "";
    // 跟踪器IP地址，多个使用分号隔开
    private String trackerServers = "";
    // 跟踪器端口
    private String httpTrackerHttpPort = "8080";

    // 是否使用Token
    private String httpAntiStealToken = "false";
    // Token加密密钥
    private String httpSecretKey = "";

    // 连接超时时间
    private String connectTimeout = "5";
    // 网络超时时间
    private String networkTimeout = "30";
    // 字符集编码
    private String charset = "UTF-8";
    // 连接池的连接对象最大个数
    private String connectionPoolMaxTotal = "10";
    // 连接池的最大空闲对象个数
    private String connectionPoolMaxIdle = "10";
    // 连接池的最小空闲对象个数
    private String connectionPoolMinIdle = "1";

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public void setConnectTimeout(String connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public void setNetworkTimeout(String networkTimeout) {
        this.networkTimeout = networkTimeout;
    }

    public void setCharset(String charset) {
        this.charset = charset;
    }

    public void setHttpAntiStealToken(String httpAntiStealToken) {
        this.httpAntiStealToken = httpAntiStealToken;
    }

    public void setHttpSecretKey(String httpSecretKey) {
        this.httpSecretKey = httpSecretKey;
    }

    public void setHttpTrackerHttpPort(String httpTrackerHttpPort) {
        this.httpTrackerHttpPort = httpTrackerHttpPort;
    }

    public void setTrackerServers(String trackerServers) {
        this.trackerServers = trackerServers;
    }

    public void setConnectionPoolMaxTotal(String connectionPoolMaxTotal) {
        this.connectionPoolMaxTotal = connectionPoolMaxTotal;
    }

    public void setConnectionPoolMaxIdle(String connectionPoolMaxIdle) {
        this.connectionPoolMaxIdle = connectionPoolMaxIdle;
    }

    public void setConnectionPoolMinIdle(String connectionPoolMinIdle) {
        this.connectionPoolMinIdle = connectionPoolMinIdle;
    }

    public void setNginxServers(String nginxServers) {
        this.nginxServers = nginxServers;
    }

    public String getConnectTimeout() {
        return connectTimeout;
    }

    public String getNetworkTimeout() {
        return networkTimeout;
    }

    public String getCharset() {
        return charset;
    }

    public String getHttpAntiStealToken() {
        return httpAntiStealToken;
    }

    public String getHttpSecretKey() {
        return httpSecretKey;
    }

    public String getHttpTrackerHttpPort() {
        return httpTrackerHttpPort;
    }

    public String getTrackerServers() {
        return trackerServers;
    }

    public String getConnectionPoolMaxTotal() {
        return connectionPoolMaxTotal;
    }

    public String getConnectionPoolMaxIdle() {
        return connectionPoolMaxIdle;
    }

    public String getConnectionPoolMinIdle() {
        return connectionPoolMinIdle;
    }

    public String getNginxServers() {
        return nginxServers;
    }

}
