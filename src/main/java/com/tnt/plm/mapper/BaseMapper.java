package com.tnt.plm.mapper;

import com.tnt.plm.model.entity.BaseEntity;

/**
 * @author Fuen
 */
public interface BaseMapper<E extends BaseEntity> {
    void insert(E e);
    E findById(Long id);
    int deleteById(Long id);
}
