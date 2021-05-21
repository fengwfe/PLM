package com.tnt.plm.model.dto.meta;

import lombok.Data;

import java.io.Serializable;

@Data
public class ListValue implements Serializable {
    private String label;
    private String value;
}
