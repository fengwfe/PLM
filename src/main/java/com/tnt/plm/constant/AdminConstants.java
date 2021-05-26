package com.tnt.plm.constant;

public interface AdminConstants {

    String NODE_TABLE = "0";
    String NODE_ATTR = "1";

    String P_LABEL = "0";


    // admin client对应的就是这个root的Node
    String NODE_KEY_ADMIN_ROOT = "ADMIN_ROOT";

    //各种class定义
    String NODE_KEY_CLASSES = "CLASSES";
    String NODE_KEY_BASE_CLASS_ITEM = "BASE_CLASS_ITEM";
    String NODE_KEY_CLASS_PARTS = "CLASS_PARTS";
    String NODE_KEY_CLASS_DOCUMENTS = "CLASS_DOCUMENTS";


    // 各种tab定义
    String NODE_KEY_TAB_PARTS_GI = "TAB_PARTS_GI";
    String NODE_KEY_TAB_PARTS_BOM = "TAB_PARTS_BOM";
    String NODE_KEY_TAB_PARTS_HISTORY = "TAB_PARTS_HISTORY";

    //各种attribute 定义
    String NODE_KEY_ATTR_PARTS_GI_NUMBER = "ATTR_PARTS_GI_NUMBER";
    String NODE_KEY_ATTR_PARTS_GI_DESCRIPTION = "ATTR_PARTS_GI_DESCRIPTION";


    //各种property key的定义
    String PROP_KEY_TYPE = "TYPE";//标识对应的NODE是什么,(attribute? tab? class?...)
    String PROP_KEY_DISPLAY = "DISPLAY";//页面显示的名称
    String PROP_KEY_ATTR_TYPE = "ATTR_TYPE";//attribute的类型
    String PROP_KEY_INHERIT = "INHERIT";//从哪继承过来的
    String PROP_KEY_VISIBLE = "VISIBLE";
    String PROP_KEY_ENABLED = "ENABLED";
    String PROP_KEY_MAX_VALUE = "MAX_VALUE";
    String PROP_KEY_MIN_VALUE = "MIN_VALUE";
    String PROP_KEY_DEFAULT_VALUE = "DEFAULT_VALUE";

}
