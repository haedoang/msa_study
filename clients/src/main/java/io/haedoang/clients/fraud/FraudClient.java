package io.haedoang.clients.fraud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * fileName : FraudClient
 * author : haedoang
 * date : 2022-06-22
 * description :
 */
//@FeignClient(
//        value = "fraud",
//        path = "api/v1/fraud-check"
//)
@FeignClient("fraud")
public interface FraudClient {

    @GetMapping(path = "api/v1/fraud-check/{customerId}")
    FraudCheckResponse isFraudster(@PathVariable("customerId") Integer customerId);
}
