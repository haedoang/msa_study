package io.haedoang.notification;

import io.haedoang.clients.notification.NotificationRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * fileName : NotificationController
 * author : haedoang
 * date : 2022-06-22
 * description :
 */
@Slf4j
@RestController
@RequestMapping("api/v1/notification")
@AllArgsConstructor
public class NotificationController {
    private final NotificationService notificationService;

    @PostMapping
    public void save(@RequestBody NotificationRequest request) {
        log.info("New notification ... {}", request);
        notificationService.send(request);
    }
}
