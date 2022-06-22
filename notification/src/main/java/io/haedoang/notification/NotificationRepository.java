package io.haedoang.notification;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * fileName : NotificationRepository
 * author : haedoang
 * date : 2022-06-22
 * description :
 */
public interface NotificationRepository extends JpaRepository<Notification, Integer> {
}
