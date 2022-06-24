package io.haedoang;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * fileName : MessageController
 * author : haedoang
 * date : 2022-06-24
 * description :
 */
@RestController
@RequestMapping("api/v1/messages")
@RequiredArgsConstructor
public class MessageController {
    private final KafkaTemplate<String, Message> kafkaTemplate;

    @PostMapping
    public void publish(@RequestBody MessageRequest request) {
        Message message = new Message(request.message(), LocalDateTime.now());
        this.kafkaTemplate.send("amigoscode", message);
    }

}
