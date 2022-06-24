package io.haedoang;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * fileName : KafkaListeners
 * author : haedoang
 * date : 2022-06-24
 * description :
 */
@Slf4j
@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "amigoscode",
            groupId = "groupId",
            containerFactory = "messageFactory" //org.springframework.kafka.config.KafkaListenerContainerFactory  endpoint
    )
    void Listener(Message data) {
        log.info("Listener received: {}", data);
    }
}
