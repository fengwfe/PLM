package com.tnt.plm.mapper;

import com.tnt.plm.model.entity.AdminNode;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminNodeMapper extends BaseMapper<AdminNode>{
    AdminNode findByKey(String nodeKey);
    List<AdminNode> findByParentId(Long parentId);
}
