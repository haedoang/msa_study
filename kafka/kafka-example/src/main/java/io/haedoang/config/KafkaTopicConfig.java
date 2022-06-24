package io.haedoang.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * fileName : KafkaTopicConfig
 * author : haedoang
 * date : 2022-06-24
 * description :
 */
@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic amigoscodeTopic() {
        return TopicBuilder
                .name("amigosocde")
                .build();
    }
}
