package com.mufid.finance.entity.mapper;


import com.mufid.finance.dto.FundTransfer;
import com.mufid.finance.entity.FundTransferEntity;
import org.springframework.beans.BeanUtils;

public class FundTransferMapper extends BaseMapper<FundTransferEntity, FundTransfer> {
    @Override
    public FundTransferEntity convertToEntity(FundTransfer dto, Object... args) {
        FundTransferEntity entity = new FundTransferEntity();
        if (dto != null) {
            BeanUtils.copyProperties(dto, entity);
        }
        return entity;
    }
    @Override
    public FundTransfer convertToDto(FundTransferEntity entity, Object... args) {
        FundTransfer dto = new FundTransfer();
        if (entity != null) {
            BeanUtils.copyProperties(entity, dto);
        }
        return dto;
    }
}
