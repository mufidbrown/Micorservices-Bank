package com.mufid.finance.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class UserResponse extends AuditAware {

    private Long id;

    private String email;

    private String identification;

    private String password;

    private String authId;

    private Status status;

}
