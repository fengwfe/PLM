package com.tnt.plm.model.dto;

import lombok.Data;

import java.io.Serializable;
@Data
public abstract class BaseRequest implements Serializable {
    private Long workspaceId;
}
