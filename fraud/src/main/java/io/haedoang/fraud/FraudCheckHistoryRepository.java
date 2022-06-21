package io.haedoang.fraud;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * fileName : FraudCheckHistoryRepository
 * author : haedoang
 * date : 2022-06-21
 * description :
 */
public interface FraudCheckHistoryRepository
        extends JpaRepository<FraudCheckHistory, Integer> {
}
