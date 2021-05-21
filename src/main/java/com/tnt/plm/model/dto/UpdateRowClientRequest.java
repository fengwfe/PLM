package com.tnt.plm.model.dto;

import com.tnt.plm.model.dto.meta.Cell;
import lombok.Data;

import java.util.List;

@Data
public class UpdateRowClientRequest {
    private Long objClassId;
    private Long objSubClassId;
    private List<Cell> dirtyCells;
}
