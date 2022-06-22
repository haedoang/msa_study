package io.haedoang.notification.rabbitmq;

import io.haedoang.clients.notification.NotificationRequest;
import io.haedoang.notification.NotificationService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * fileName : NotificationConsumer
 * author : haedoang
 * date : 2022-06-22
 * description :
 */
@Component
@AllArgsConstructor
@Slf4j
public class NotificationConsumer {
    private final NotificationService notificationService;

    @RabbitListener(queues = "${rabbitmq.queue.notification}")
    public void consumer(NotificationRequest request) {
        log.info("Consumed {} from queue", request);
        notificationService.send(request);
    }
}
