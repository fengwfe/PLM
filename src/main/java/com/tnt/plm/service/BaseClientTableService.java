package com.tnt.plm.service;

import com.tnt.plm.model.dto.LoadTableClientRequest;
import com.tnt.plm.model.dto.meta.BaseClientTable;

public interface BaseClientTableService {
    BaseClientTable loadTable(LoadTableClientRequest request);
}
