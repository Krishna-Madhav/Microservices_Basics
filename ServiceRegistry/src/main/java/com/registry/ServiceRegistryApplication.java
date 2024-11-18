package com.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
/*
	Service Registry contains all the registries of the different services (like Quiz service, Question Service etc.) which we
	have created in microservices project. It manages all the instances of the services like number of instances which are upa and running.

	Service Registry follow client server architecture.
	All the services are (Eureka) clients and service registry is (Eureka) server.

* */
public class ServiceRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRegistryApplication.class, args);
    }

}
