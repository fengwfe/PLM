package com.tnt.plm.model.dto.meta;

import com.tnt.plm.constant.PLMConstants;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Fuen
 *
 *A meta data class, used to describe attribute
 */
@Data
public abstract class AttributeDescriptor implements Serializable, PLMConstants {
    private Long id;
    private String key;
    private String displayName;
    private Integer attrType;
    private Integer visible;
    private String dbTable;
    private String dbColumn;
    public boolean isVisible(){
        return YES.compareTo(visible) == 0;
    }
}
