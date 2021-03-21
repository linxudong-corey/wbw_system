package com.wbw.common;


import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@ToString
@Component
@Configuration
@PropertySource("classpath:application.properties")
@ConfigurationProperties(prefix = "socket")
public class SocketProperties {
    private Integer port;
    private Integer poolKeep;
    private Integer poolCore;
    private Integer poolMax;
    private Integer poolQueueInit;
}
