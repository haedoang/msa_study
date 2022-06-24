package io.haedoang;

import java.time.LocalDateTime;

/**
 * fileName : Message
 * author : haedoang
 * date : 2022-06-24
 * description :
 */
public record Message(String message, LocalDateTime createdAt) {
}
