package com.mufid.finance.dto;

import com.mufid.finance.entity.Status;
import lombok.Data;

@Data
public class UserUpdateRequest {
    private Status status;
}
