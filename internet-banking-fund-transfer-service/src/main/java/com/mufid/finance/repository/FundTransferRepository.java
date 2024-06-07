package com.mufid.finance.repository;


import com.mufid.finance.entity.FundTransferEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FundTransferRepository extends JpaRepository<FundTransferEntity, Long> {

}
