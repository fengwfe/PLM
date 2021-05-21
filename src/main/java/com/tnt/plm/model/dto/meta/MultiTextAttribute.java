package com.tnt.plm.model.dto.meta;

import com.tnt.plm.model.dto.meta.AttributeDescriptor;
import lombok.Data;

@Data
public class MultiTextAttribute extends AttributeDescriptor {
    private Integer maxLength;
    private Integer minLength;
}
