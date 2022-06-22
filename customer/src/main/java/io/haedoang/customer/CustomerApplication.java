package io.haedoang.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * fileName : CustomerApplication
 * author : haedoang
 * date : 2022-06-21
 * description :
 */
@EnableFeignClients(
        basePackages = "io.haedoang.clients"
)
@EnableEurekaClient
@SpringBootApplication(
        scanBasePackages = {
                "io.haedoang.customer",
                "io.haedoang.amqp"
        }
)
public class CustomerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class, args);
    }
}
