package com.tnt.plm.model.entity;

import lombok.Data;

@Data
public class Item extends BaseEntity{
    private Long classId;
    private Long subClassId;
    private String number;
    private String description;
}
