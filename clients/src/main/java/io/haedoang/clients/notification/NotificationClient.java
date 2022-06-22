package io.haedoang.clients.notification;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * fileName : NotificationClient
 * author : haedoang
 * date : 2022-06-22
 * description :
 */
@FeignClient("notification")
public interface NotificationClient {

    @PostMapping("api/v1/notification")
    void save(@RequestBody NotificationRequest request);
}
