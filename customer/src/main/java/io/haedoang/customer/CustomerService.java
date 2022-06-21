package io.haedoang.customer;

import org.springframework.stereotype.Service;

/**
 * fileName : CustomerService
 * author : haedoang
 * date : 2022-06-21
 * description :
 */
@Service
public record CustomerService(CustomerRepository customerRepository) {

    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();

        // todo : check if email valid
        // todo : check if email not taken
        // todo : store customer in db
        customerRepository.save(customer);
    }

}
