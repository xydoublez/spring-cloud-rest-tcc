package com.github.prontera;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringCloudApplication
public class ConfigMsApplication {

    public static void main(String[] args) {
	System.setProperty("http.proxyHost", "10.68.4.22");
        System.setProperty("http.808", "808");
        System.setProperty("https.proxyHost", "10.68.4.22");
        System.setProperty("https.808", "808");
        System.setProperty("ftp.proxyHost", "10.68.4.22");
        System.setProperty("ftp.808", "808");
        SpringApplication.run(ConfigMsApplication.class, args);
    }
}
