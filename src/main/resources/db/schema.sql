drop table if exists `item`;


CREATE TABLE `item` (
    `id` int unsigned NOT NULL AUTO_INCREMENT COMMENT 'pk',
    `classId` int unsigned NOT NULL COMMENT 'class id',
    `subClassId` int unsigned NOT NULL COMMENT 'subclass id',
    `number` varchar(256) DEFAULT NULL COMMENT 'item number',
    `description` varchar(1024) DEFAULT NULL COMMENT 'item description',
    `created` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `createdBy` int unsigned NOT NULL COMMENT '创建记录的人',
    `updated` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最新更新时间',
    `updatedBy` int unsigned NOT NULL COMMENT '最近更新的人',
    `version` int unsigned NOT NULL DEFAULT '1' COMMENT '乐观锁',
    `deleted` tinyint(1) unsigned DEFAULT '0' COMMENT '是否已经软删除',
    PRIMARY KEY (`id`),
    UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

drop TRIGGER if exists item_version;
CREATE TRIGGER item_version
    BEFORE UPDATE
    ON item
    FOR EACH ROW
    SET NEW.version= OLD.version + 1, NEW.updated = CURRENT_TIMESTAMP;


drop table if exists `admin_node`;

CREATE TABLE `admin_node` (
                        `id` int unsigned NOT NULL AUTO_INCREMENT COMMENT 'pk',
                        `nodeKey` varchar(256) NOT NULL COMMENT '唯一key',
                        `parentId` int unsigned DEFAULT NULL COMMENT '父node节点id',
                        `description` varchar(256) DEFAULT NULL COMMENT '节点描述',
                        `created` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                        `createdBy` int unsigned NOT NULL COMMENT '创建记录的人',
                        `updated` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最新更新时间',
                        `updatedBy` int unsigned NOT NULL COMMENT '最近更新的人',
                        `version` int unsigned NOT NULL DEFAULT '1' COMMENT '乐观锁',
                        `deleted` tinyint(1) unsigned DEFAULT '0' COMMENT '是否已经软删除',
                        PRIMARY KEY (`id`),
                        UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

drop TRIGGER if exists admin_node_version;
CREATE TRIGGER admin_node_version
    BEFORE UPDATE
    ON admin_node
    FOR EACH ROW
    SET NEW.version= OLD.version + 1, NEW.updated = CURRENT_TIMESTAMP;

drop table if exists `admin_property`;

CREATE TABLE `admin_property` (
                              `id` int unsigned NOT NULL AUTO_INCREMENT COMMENT 'pk',
                              `nodeId` int unsigned DEFAULT NULL COMMENT 'node节点id',
                              `pKey` varchar(256) NOT NULL COMMENT '属性key',
                              `pValue` varchar(256) DEFAULT NULL COMMENT '属性值',
                              `description` varchar(256) DEFAULT NULL COMMENT '节点描述',
                              `created` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
                              `createdBy` int unsigned NOT NULL COMMENT '创建记录的人',
                              `updated` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '最新更新时间',
                              `updatedBy` int unsigned NOT NULL COMMENT '最近更新的人',
                              `version` int unsigned NOT NULL DEFAULT '1' COMMENT '乐观锁',
                              `deleted` tinyint(1) unsigned DEFAULT '0' COMMENT '是否已经软删除',
                              PRIMARY KEY (`id`),
                              UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

drop TRIGGER if exists admin_property_version;
CREATE TRIGGER admin_property_version
    BEFORE UPDATE
    ON admin_property
    FOR EACH ROW
    SET NEW.version= OLD.version + 1, NEW.updated = CURRENT_TIMESTAMP;