package com.tnt.plm.model.dto.meta;

import lombok.Data;

import java.util.List;

@Data
public class BaseClientTable {
    private Integer tableId;
    private List<Cell> cells;
}
