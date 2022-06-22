package io.haedoang.notification;

import io.haedoang.amqp.RabbitMQMessageProducer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * fileName : NotificationApplication
 * author : haedoang
 * date : 2022-06-22
 * description :
 */
@SpringBootApplication(
        scanBasePackages = {
                "io.haedoang.notification",
                "io.haedoang.amqp"
        }
)
public class NotificationApplication {
    public static void main(String[] args) {
        SpringApplication.run(NotificationApplication.class, args);
    }


// rabbit mq test
//    @Bean
//    CommandLineRunner commandLineRunner(
//            RabbitMQMessageProducer producer,
//            NotificationConfig notificationConfig
//            ) {
//        return args -> {
//           producer.publish(
//                   new Person("haedoang", 34),
//                   notificationConfig.getInternalExchange(),
//                   notificationConfig.getInternalNotificationRoutingKey()
//           );
//        };
//    }
//
//    record Person(String name, int age) {}
}
