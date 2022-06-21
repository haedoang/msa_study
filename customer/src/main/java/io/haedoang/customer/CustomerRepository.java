package io.haedoang.customer;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * fileName : CustomerRepository
 * author : haedoang
 * date : 2022-06-21
 * description :
 */
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
