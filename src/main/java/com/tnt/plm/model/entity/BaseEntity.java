package com.tnt.plm.model.entity;

import com.tnt.plm.constant.PLMConstants;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Fuen
 */
@Data
public class BaseEntity implements Serializable, PLMConstants {
    private Long id;
    private Long workspaceId;
    private Integer deleted;
    private Integer version;
    private Date created;
    private Long createdBy;
    private Date updated;
    private Long updatedBy;
    public boolean isDeleted(){
        return YES.equals(this.deleted);
    }
}
