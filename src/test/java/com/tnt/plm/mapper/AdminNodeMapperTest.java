package com.tnt.plm.mapper;

import com.tnt.plm.constant.AdminConstants;
import com.tnt.plm.constant.PLMConstants;
import com.tnt.plm.model.entity.AdminNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class AdminNodeMapperTest {
    @Autowired
    AdminNodeMapper adminNodeMapper;


    @Test
    public void testInsert(){
        AdminNode node = new AdminNode();
        node.setNodeKey(AdminConstants.NODE_ATTR);
        node.setDescription("attribute");
        node.setCreatedBy(1l);
        node.setUpdatedBy(2l);
        adminNodeMapper.insert(node);
        Assertions.assertNotNull(node.getId());
    }

    @Test
    public void testDeleteById(){
        AdminNode node = new AdminNode();
        node.setNodeKey(AdminConstants.NODE_ATTR);
        node.setDescription("attribute");
        node.setCreatedBy(1l);
        node.setUpdatedBy(2l);
        adminNodeMapper.insert(node);
        Assertions.assertNotNull(node.getId());
        adminNodeMapper.deleteById(node.getId());
        node = adminNodeMapper.findById(node.getId());
        Assertions.assertEquals(node.getDeleted(), PLMConstants.YES);
    }


}
