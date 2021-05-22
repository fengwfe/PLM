package com.tnt.plm.mapper;

import com.tnt.plm.model.entity.AdminProperty;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminPropertyMapper extends BaseMapper<AdminProperty>{
    AdminProperty findByKey(String pKey);
    List<AdminProperty> findByNodeId(Long nodeId);
}
