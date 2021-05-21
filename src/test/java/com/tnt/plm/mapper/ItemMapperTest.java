package com.tnt.plm.mapper;

import com.tnt.plm.constant.PLMConstants;
import com.tnt.plm.model.entity.Item;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Fuen
 */

@SpringBootTest
public class ItemMapperTest {

    @Autowired
    ItemMapper itemMapper;

    @Test
    public void testInsert(){
        Item item = new Item();
        item.setNumber("P0001");
        item.setDescription("My first Item");
        item.setClassId(1000l);
        item.setSubClassId(2000l);
        item.setCreatedBy(1l);
        item.setUpdatedBy(2l);
        itemMapper.insert(item);
        assertNotNull(item.getId());
        item = itemMapper.findById(item.getId());
        assertEquals(item.getVersion(), 1);
        assertEquals(item.getDeleted(), PLMConstants.NO);
        assertEquals(item.getNumber(), "P0001");
        assertEquals(item.getDescription(), "My first Item");
        assertEquals(item.getClassId(), 1000);
        assertEquals(item.getSubClassId(), 2000);
        assertEquals(item.getCreatedBy(), 1l);
        assertEquals(item.getUpdatedBy(), 2l);
        assertNotNull(item.getCreated());
        assertNotNull(item.getUpdated());

    }

    @Test
    public void testDeleteById(){
        Item item = new Item();
        item.setNumber("P0001");
        item.setDescription("My first Item");
        item.setClassId(1000l);
        item.setSubClassId(2000l);
        item.setCreatedBy(1l);
        item.setUpdatedBy(2l);
        itemMapper.insert(item);
        itemMapper.deleteById(item.getId());
        item = itemMapper.findById(item.getId());
        assertEquals(item.getVersion(), 2);
        assertEquals(item.getDeleted(), PLMConstants.YES);

    }

}
