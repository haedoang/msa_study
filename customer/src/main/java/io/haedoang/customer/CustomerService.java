package io.haedoang.customer;

import io.haedoang.clients.fraud.FraudCheckResponse;
import io.haedoang.clients.fraud.FraudClient;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * fileName : CustomerService
 * author : haedoang
 * date : 2022-06-21
 * description :
 */
@Service
@AllArgsConstructor
public class CustomerService {
    private final CustomerRepository customerRepository;
    private final RestTemplate restTemplate;

    private final FraudClient fraudClient;

    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();

        // todo : check if email valid
        // todo : check if email not taken
        customerRepository.saveAndFlush(customer);
        // todo: check if fraudster

//        as-is
//        FraudCheckResponse fraudCheckResponse = restTemplate.getForObject(
//                //"http://localhost:8081/api/v1/fraud-check/{customerId}",
//                "http://FRAUD:8081/api/v1/fraud-check/{customerId}",
//                FraudCheckResponse.class,
//                customer.getId()
//        );

        // to-be
        FraudCheckResponse fraudCheckResponse = fraudClient.isFraudster(customer.getId());

        if (fraudCheckResponse.isFraudster()) {
            throw new IllegalStateException("fraudster");
        }

        // todo: send notification
    }

}
