package com.tnt.plm.model.entity;

import lombok.Data;

@Data
public class AdminProperty extends BaseEntity{
    private Long nodeId;
    private String pKey;
    private String pValue;
    private String description;
}
