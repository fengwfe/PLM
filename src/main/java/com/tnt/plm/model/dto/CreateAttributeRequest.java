package com.tnt.plm.model.dto;

import java.io.Serializable;

public  class CreateAttributeRequest implements Serializable {
    private Long tabId;//指定是哪个tab下的attribute, like bom, gi...
    private String attrType;//类型，text, list...
    private String apiKey;//唯一性标识
    private Boolean visible;//是否可见
    private Long inherit;//继承的attribute id
    private String dbName;//attribute的值存db的哪张表
    private String dbColumn;//attribute的值存db的哪个字段


}
