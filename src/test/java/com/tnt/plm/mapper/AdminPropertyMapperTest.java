package com.tnt.plm.mapper;

import com.tnt.plm.constant.AdminConstants;
import com.tnt.plm.constant.PLMConstants;
import com.tnt.plm.model.entity.AdminProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AdminPropertyMapperTest {

    @Autowired
    AdminPropertyMapper adminPropertyMapper;

    @Test
    public void testInsert(){
        AdminProperty property = new AdminProperty();
        property.setNodeId(1l);
        property.setPKey(AdminConstants.P_LABEL);
        property.setPValue("User Name");
        property.setDescription("label name");
        property.setCreatedBy(1l);
        property.setUpdatedBy(2l);
        adminPropertyMapper.insert(property);
        Assertions.assertNotNull(property.getId());
    }

    @Test
    public void testDeleteById(){
        AdminProperty property = new AdminProperty();
        property.setNodeId(1l);
        property.setPKey(AdminConstants.P_LABEL);
        property.setPValue("User Name");
        property.setDescription("label name");
        property.setCreatedBy(1l);
        property.setUpdatedBy(2l);
        adminPropertyMapper.insert(property);
        Assertions.assertNotNull(property.getId());
        adminPropertyMapper.deleteById(property.getId());
        property = adminPropertyMapper.findById(property.getId());
        Assertions.assertEquals(property.getDeleted(), PLMConstants.YES);
    }
}
