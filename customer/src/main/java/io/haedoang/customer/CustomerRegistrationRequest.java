package io.haedoang.customer;

/**
 * fileName : CustomerRegistrationRequest
 * author : haedoang
 * date : 2022-06-21
 * description :
 */
public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {
}
