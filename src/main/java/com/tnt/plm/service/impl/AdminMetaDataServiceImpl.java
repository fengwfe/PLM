package com.tnt.plm.service.impl;

import com.tnt.plm.mapper.AdminNodeMapper;
import com.tnt.plm.mapper.AdminPropertyMapper;
import com.tnt.plm.model.UpdateBaseClassResponse;
import com.tnt.plm.model.dto.*;
import com.tnt.plm.service.AdminMetaDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminMetaDataServiceImpl implements AdminMetaDataService {

    @Autowired
    private AdminNodeMapper adminNodeMapper;

    @Autowired
    private AdminPropertyMapper adminPropertyMapper;

    @Override
    public void setUpAll(Long workspaceId) {
        //TODO

    }

    @Override
    public UpdateBaseClassResponse updateBaseClass(UpdateBaseClassRequest request) {
        return null;
    }

    @Override
    public BaseClassDetailDTO findBaseClassById(Long id) {
        return null;
    }

    @Override
    public List<BaseClassDetailDTO> findAllBaseClass() {
        return null;
    }

    @Override
    public UpdateClassResponse updateClass(UpdateClassRequest request) {
        return null;
    }

    @Override
    public ClassDetailDTO findClassById(Long id) {
        return null;
    }

    @Override
    public List<ClassDetailDTO> findAllClassByBaseClassId(Long baseClassId) {
        return null;
    }

    @Override
    public CreateSubclassResponse createSubClass(CreateSubClassRequest request) {
        return null;
    }

    @Override
    public UpdateSubClassResponse updateSubClass(UpdateSubClassRquest request) {
        return null;
    }

    @Override
    public SubClassDetailDTO findSubClassById(Long id) {
        return null;
    }

    @Override
    public List<SubClassDetailDTO> findAllSubClassByClassId(Long classId) {
        return null;
    }

    @Override
    public int deleteSubClass(Long subClasId) {
        return 0;
    }

    @Override
    public UpdateTabResponse updateTab(UpdateTabRequest request) {
        return null;
    }

    @Override
    public TabDetailDTO findTabById(Long tabId) {
        return null;
    }

    @Override
    public List<TabDetailDTO> findTabsByParentId(Long parentId) {
        return null;
    }

    @Override
    public CreateAttributeResponse createAttribute(CreateAttributeRequest request) {
        return null;
    }

    @Override
    public UpdateAttributeResponse updateAttribute(UpdateAttributeRequest request) {
        return null;
    }

    @Override
    public int deleteAttribute(Long attrId) {
        return 0;
    }

    @Override
    public AttributeDetailDTO findAttributeById(Long attrId) {
        return null;
    }

    @Override
    public List<AttributeDetailDTO> findAttributesByTabId(Long tabId) {
        return null;
    }
}
