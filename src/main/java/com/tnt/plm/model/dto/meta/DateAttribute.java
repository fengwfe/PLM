package com.tnt.plm.model.dto.meta;

import lombok.Data;

@Data
public class DateAttribute extends AttributeDescriptor{
    private Integer dateOnly;
    private String format;
}
