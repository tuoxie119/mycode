package com.example.autoconfiguremydb.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by liys on 2019/8/31.
 */
@ConfigurationProperties(prefix="spring.mydb")
public class MyDBProperties {
    private String url;

    /**
     * Redis server host.
     */
    private String host = "localhost";

    /**
     * Login password of the redis server.
     */
    private String password;

    /**
     * Redis server port.
     */
    private int port = 8888;

    /**
     * Whether to enable SSL support.
     */
    private boolean ssl;


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public boolean isSsl() {
        return ssl;
    }

    public void setSsl(boolean ssl) {
        this.ssl = ssl;
    }


    @Override
    public String toString() {
        return "MyDBProperties{" +
                "url='" + url + '\'' +
                ", host='" + host + '\'' +
                ", password='" + password + '\'' +
                ", port=" + port +
                ", ssl=" + ssl +
                '}';
    }
}
