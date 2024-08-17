package com.mufid.finance.dto;

import com.mufid.finance.entity.TransactionStatus;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class UtilityPayment extends AuditAware {
    private Long providerId;
    private BigDecimal amount;
    private String referenceNumber;
    private String account;
    private TransactionStatus status;
}
