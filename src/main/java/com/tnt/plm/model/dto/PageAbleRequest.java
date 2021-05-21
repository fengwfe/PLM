package com.tnt.plm.model.dto;

import com.tnt.plm.model.dto.meta.AttributeDescriptor;
import lombok.Data;

import java.io.Serializable;

@Data
public class PageAbleRequest implements Serializable {
    private Integer pageSize;
    private Integer pageNum;
    private AttributeDescriptor orderBy;
    private Boolean asc;
}
