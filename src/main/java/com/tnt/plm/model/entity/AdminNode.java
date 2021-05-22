package com.tnt.plm.model.entity;

import lombok.Data;

@Data
public class AdminNode extends BaseEntity{
    private String nodeKey;
    private Long parentId;
    private String description;

}
