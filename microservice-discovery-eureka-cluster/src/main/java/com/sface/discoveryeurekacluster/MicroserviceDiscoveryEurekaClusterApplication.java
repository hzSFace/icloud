package com.sface.discoveryeurekacluster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceDiscoveryEurekaClusterApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceDiscoveryEurekaClusterApplication.class, args);
    }

}
