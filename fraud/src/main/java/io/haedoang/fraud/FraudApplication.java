package io.haedoang.fraud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/**
 * fileName : FraudApplication
 * author : haedoang
 * date : 2022-06-21
 * description :
 */
@EnableEurekaClient
@SpringBootApplication
@PropertySources({
        @PropertySource("classpath:clients-${spring.profiles.active}.properties")
})
public class FraudApplication {
    public static void main(String[] args) {
        SpringApplication.run(FraudApplication.class, args);
    }
}
