package io.haedoang.clients.notification;

/**
 * fileName : NotificationRequest
 * author : haedoang
 * date : 2022-06-22
 * description :
 */
public record NotificationRequest(
        Integer toCustomerId,
        String toCustomerEmail,
        String message
) {
}
