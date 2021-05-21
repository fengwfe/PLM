package com.tnt.plm.model.dto.meta;

import com.tnt.plm.model.dto.meta.AttributeDescriptor;

public class ListAttribute extends AttributeDescriptor {
    private boolean isDynamic;
    private Integer displayType;//static or by search
    private Long valueDescriptorId;// used to fetch list values
}
