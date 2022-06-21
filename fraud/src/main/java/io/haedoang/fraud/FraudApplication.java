package io.haedoang.fraud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * fileName : FraudApplication
 * author : haedoang
 * date : 2022-06-21
 * description :
 */
@EnableEurekaClient
@SpringBootApplication
public class FraudApplication {
    public static void main(String[] args) {
        SpringApplication.run(FraudApplication.class, args);
    }
}
