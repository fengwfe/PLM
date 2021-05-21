package com.tnt.plm.model.dto.meta;

import lombok.Data;


@Data
public class TextAttribute extends AttributeDescriptor {
    private Integer maxLength;
    private Integer minLength;
}
