package com.tnt.plm.service;

import com.tnt.plm.model.UpdateBaseClassResponse;
import com.tnt.plm.model.dto.*;

import java.util.List;

public interface AdminMetaDataService {

    /**
     * 为新的workspace创建所有metaData,通过run 特定的sql或者存储过程来实现
     * @param workspaceId
     */
    public void setUpAll(Long workspaceId);

    /** Class 相关接口定义  **/

    /**
     * 更新指定的base class
     * @param request
     * @return
     */
    public UpdateBaseClassResponse updateBaseClass(UpdateBaseClassRequest request);
    /**
     * 通过id获取base class 信息
     * @param id
     * @return
     */
    public BaseClassDetailDTO findBaseClassById(Long id);

    /**
     * 获取所有的base class信息
     * @return
     */
    public List<BaseClassDetailDTO> findAllBaseClass();

    /**
     * 更新指定的class
     * @param request
     * @return
     */
    public UpdateClassResponse updateClass(UpdateClassRequest request);

    /**
     * 通过id获取class信息
     * @param id
     * @return
     */
    public ClassDetailDTO findClassById(Long id);

    /**
     * 获取指定base class 下的所有 class
     * @param baseClassId
     * @return
     */
    public List<ClassDetailDTO> findAllClassByBaseClassId(Long baseClassId);
    /**
     * 为指定的class创建sub class
     * @param request
     * @return
     */
    public CreateSubclassResponse createSubClass(CreateSubClassRequest request);

    /**
     * 更新指定的sub class
     * @param request
     * @return
     */
    public UpdateSubClassResponse updateSubClass(UpdateSubClassRquest request);

    /**
     * 通过id获取sub class信息
     * @param id
     * @return
     */
    public SubClassDetailDTO findSubClassById(Long id);

    /**
     * 获取指定class的所有sub class信息
     * @param classId
     * @return
     */
    public List<SubClassDetailDTO> findAllSubClassByClassId(Long classId);

    /**
     * 删除指定的sub class
     * @param subClasId
     * @return
     */
    public int deleteSubClass(Long subClasId);

    /** Tab 相关的接口定义 **/

    /**
     * 更新指定的tab
     * @param request
     * @return
     */
    public UpdateTabResponse updateTab(UpdateTabRequest request);

    /**
     * 获取指定tab的信息
     * @param tabId
     * @return
     */
    public TabDetailDTO findTabById(Long tabId);

    /**
     * 获取指定class 或 subclass的所有tabs
     * @param parentId
     * @return
     */
    List<TabDetailDTO> findTabsByParentId(Long parentId);

    /** Attribute 相关的接口定义 **/

    /**
     * 为特定的tab创建attribute
     * @param request
     * @return
     */
    public CreateAttributeResponse createAttribute(CreateAttributeRequest request);

    /**
     * 更新attribute
     * @param request
     * @return
     */
    public UpdateAttributeResponse updateAttribute(UpdateAttributeRequest request);

    /**
     * 删除指定的attribute
     * @param attrId
     * @return
     */
    public int deleteAttribute(Long attrId);

    /**
     * 获取特定attribute details by id
     * @param attrId
     * @return
     */
    public AttributeDetailDTO findAttributeById(Long attrId);

    /**
     *获取指定tab底下的所有attributes
     * @param tabId
     * @return
     */
    public List<AttributeDetailDTO> findAttributesByTabId(Long tabId);

}
