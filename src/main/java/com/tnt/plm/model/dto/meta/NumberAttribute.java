package com.tnt.plm.model.dto.meta;

import lombok.Data;

@Data
public class NumberAttribute extends AttributeDescriptor{
    private Integer scale;//小数点位数
}
