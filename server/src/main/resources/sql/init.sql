create database if not exists graph_site;

drop table if exists graph_site.ods_information_base;
create table if not exists graph_site.ods_information_base
(
    id            varchar(64) not null comment '主键唯一id',
    name          varchar(255) default null comment '名称',
    base_type     varchar(20)  default null comment '类别（枚举值-实体/关系）',
    alter_field_1 varchar(255) default null comment '备用字段',
    alter_field_2 varchar(255) default null comment '备用字段',
    alter_field_3 varchar(255) default null comment '备用字段',
    alter_field_4 varchar(255) default null comment '备用字段',
    alter_field_5 varchar(255) default null comment '备用字段',
    alter_field_6 varchar(255) default null comment '备用字段',
    alter_field_7 varchar(255) default null comment '备用字段',
    alter_field_8 varchar(255) default null comment '备用字段',
    status        int          default null comment '状态（系统字段）',
    incr          int          default null comment '自增索引（系统字段）',
    create_user   varchar(20)  default null comment '创建人（系统字段）',
    update_user   varchar(20)  default null comment '更新人（系统字段）',
    create_time   datetime     default null comment '创建时间（系统字段）',
    update_time   datetime     default null comment '更新时间（系统字段）',
    primary key (id),
    unique key ods_information_base_id (id) using btree,
    KEY idx_ods_information_base_incr (incr) using btree
) ENGINE = InnoDB,
  DEFAULT CHARSET = utf8mb4 COMMENT ='基本信息表';


drop table if exists graph_site.ods_entity_person;
create table if not exists graph_site.ods_entity_person
(
    id            varchar(64) not null comment '主键唯一id',
    name          varchar(255) default null comment '名称',
    entity_type   varchar(20)  default null comment '实体类别（人物）',
    sex           varchar(20)  default null comment '性别',
    age           int          default null comment '年龄',
    card_id       varchar(20)  default null comment '身份证号码',
    home          varchar(255) default null comment '家庭住址',
    now_address   varchar(255) default null comment '现居地址',
    tel           varchar(20)  default null comment '手机号码',
    other         longtext     default null comment '其他信息',
    inspect_time  varchar(50)  default null comment '检测时间',
    case_status   varchar(20)  default null comment '状态',
    alter_field_1 varchar(255) default null comment '备用字段',
    alter_field_2 varchar(255) default null comment '备用字段',
    alter_field_3 varchar(255) default null comment '备用字段',
    alter_field_4 varchar(255) default null comment '备用字段',
    alter_field_5 varchar(255) default null comment '备用字段',
    alter_field_6 varchar(255) default null comment '备用字段',
    alter_field_7 varchar(255) default null comment '备用字段',
    alter_field_8 varchar(255) default null comment '备用字段',
    source        varchar(255) default null comment '数据来源',
    status        int          default null comment '状态（系统字段）',
    incr          int          default null comment '自增索引（系统字段）',
    create_user   varchar(20)  default null comment '创建人（系统字段）',
    update_user   varchar(20)  default null comment '更新人（系统字段）',
    create_time   datetime     default null comment '创建时间（系统字段）',
    update_time   datetime     default null comment '更新时间（系统字段）',
    primary key (id),
    unique key ods_entity_person_id (id) using btree,
    KEY idx_ods_entity_person_incr (incr) using btree
) ENGINE = InnoDB,
  DEFAULT CHARSET = utf8mb4 COMMENT ='人物实体信息';

drop table if exists graph_site.ods_entity_addr;
create table if not exists graph_site.ods_entity_addr
(
    id            varchar(64) not null comment '主键唯一id',
    name          varchar(255) default null comment '名称',
    entity_type   varchar(20)  default null comment '实体类别（地址）',
    belong_to     varchar(255) default null comment '属于',
    level         varchar(20)  default null comment '风险等级',
    other         longtext     default null comment '其他信息',
    longitude     varchar(255) default null comment '经度',
    Latitude      varchar(255) default null comment '维度',
    alter_field_1 varchar(255) default null comment '备用字段',
    alter_field_2 varchar(255) default null comment '备用字段',
    alter_field_3 varchar(255) default null comment '备用字段',
    alter_field_4 varchar(255) default null comment '备用字段',
    alter_field_5 varchar(255) default null comment '备用字段',
    alter_field_6 varchar(255) default null comment '备用字段',
    alter_field_7 varchar(255) default null comment '备用字段',
    alter_field_8 varchar(255) default null comment '备用字段',
    source        varchar(255) default null comment '数据来源',
    status        int          default null comment '状态（系统字段）',
    incr          int          default null comment '自增索引（系统字段）',
    create_user   varchar(20)  default null comment '创建人（系统字段）',
    update_user   varchar(20)  default null comment '更新人（系统字段）',
    create_time   datetime     default null comment '创建时间（系统字段）',
    update_time   datetime     default null comment '更新时间（系统字段）',
    primary key (id),
    unique key ods_entity_adrr_id (id) using btree,
    KEY idx_ods_entity_adrr_incr (incr) using btree
)
    ENGINE = InnoDB,
    DEFAULT CHARSET = utf8mb4 COMMENT ='地址实体信息';

drop table if exists graph_site.ods_links_all;
create table if not exists graph_site.ods_links_all
(
    id                varchar(64) not null comment '主键唯一id',
    name              varchar(255) default null comment '名称',
    rel_type          varchar(20)  default null comment '关系类别（人-人/人-地址）',
    start_entity_id   varchar(64)  default null comment '开始节点id',
    start_entity_name varchar(255) default null comment '开始节点名称',
    start_property1   varchar(255) default null comment '开始节点属性1（人-身份证号/地址-空）',
    start_property2   varchar(255) default null comment '开始节点属性2（人-家庭地址/地址-空）',
    end_entity_id     varchar(64)  default null comment '结束节点id',
    end_entity_name   varchar(64)  default null comment '结束节点名称',
    end_property1     varchar(255) default null comment '结束节点属性1（人-身份证号/地址-空）',
    end_property2     varchar(255) default null comment '结束节点属性2（人-家庭地址/地址-空）',
    occ_time          longtext  default null comment '发生时间',
    other             longtext     default null comment '其他信息',
    alter_field_1     varchar(255) default null comment '备用字段',
    alter_field_2     varchar(255) default null comment '备用字段',
    alter_field_3     varchar(255) default null comment '备用字段',
    alter_field_4     varchar(255) default null comment '备用字段',
    alter_field_5     varchar(255) default null comment '备用字段',
    alter_field_6     varchar(255) default null comment '备用字段',
    alter_field_7     varchar(255) default null comment '备用字段',
    alter_field_8     varchar(255) default null comment '备用字段',
    source            varchar(255) default null comment '数据来源',
    status            int          default null comment '状态（系统字段）',
    incr              int          default null comment '自增索引（系统字段）',
    create_user       varchar(20)  default null comment '创建人（系统字段）',
    update_user       varchar(20)  default null comment '更新人（系统字段）',
    create_time       datetime     default null comment '创建时间（系统字段）',
    update_time       datetime     default null comment '更新时间（系统字段）',
    primary key (id),
    unique key ods_links_all_id (id) using btree,
    KEY idx_ods_links_all_incr (incr) using btree
) ENGINE = InnoDB,
  DEFAULT CHARSET = utf8mb4 COMMENT ='关系信息';


drop table if exists graph_site.task_base_information;
create table if not exists graph_site.task_base_information
(
    id         varchar(64) not null comment '主键唯一id',
    name       varchar(255) default null comment '名称',
    description varchar(255) default null comment '任务描述',
    status     boolean      default null comment '任务状态',
    schedule   varchar(20)  default null comment '调度周期',
    duty_user  varchar(20)  default null comment '负责人',
    email      varchar(64)  default null comment '邮箱',
    notice     boolean      default null comment '是否通知',
    file_path  varchar(255) default null comment '文件路劲'
) ENGINE = InnoDB,
  DEFAULT CHARSET = utf8mb4 COMMENT ='任务基本信息';

drop table if exists graph_site.task_status_information;
create table if not exists graph_site.task_status_information
(
    id       varchar(64) not null comment '主键唯一id',
    task_id  varchar(64)  default null comment '任务id',
    cur_time varchar(255) default null comment '当前时间',
    status   boolean      default null comment '当前状态',
    running  varchar(255) default null comment '运行信息'
) ENGINE = InnoDB,
  DEFAULT CHARSET = utf8mb4 COMMENT ='任务状态信息';