package com.mufid.finance.repository;

import com.mufid.finance.dto.UtilityPayment;
import com.mufid.finance.entity.UtilityPaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilityPaymentRepository extends JpaRepository<UtilityPaymentEntity, UtilityPayment> {
}
