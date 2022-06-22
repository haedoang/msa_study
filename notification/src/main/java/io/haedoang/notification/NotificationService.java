package io.haedoang.notification;

import io.haedoang.clients.notification.NotificationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * fileName : NotificationService
 * author : haedoang
 * date : 2022-06-22
 * description :
 */
@Service
@AllArgsConstructor
public class NotificationService {
    private final NotificationRepository notificationRepository;

    public void send(NotificationRequest request) {
        notificationRepository.save(Notification.builder()
                .toCustomerId(request.toCustomerId())
                .toCustomerEmail(request.toCustomerEmail())
                .sender("haedoang")
                .message(request.message())
                .sentAt(LocalDateTime.now())
                .build());
    }
}
