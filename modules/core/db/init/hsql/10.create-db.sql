-- begin SRVCAT_SERVICE
create table SRVCAT_SERVICE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    DTYPE varchar(100),
    --
    TITLE varchar(255),
    BRIEF_DESC varchar(255),
    FULL_DESC varchar(255),
    DOCS_URL varchar(255),
    OWNER varchar(255),
    FORMAT varchar(50),
    STAKE_HOLDER varchar(255),
    STATUS varchar(50),
    COUNT_REQUEST integer,
    COUNT_CONFIRM_AGREEMENT integer,
    --
    -- from srvcat_ServiceRequest
    REQUEST_STATUS varchar(50),
    --
    primary key (ID)
)^
-- end SRVCAT_SERVICE
-- begin SRVCAT_AGREEMENT_PARAMS
create table SRVCAT_AGREEMENT_PARAMS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PARAM varchar(255),
    TYPE_AGREEMENT_ID varchar(36),
    --
    primary key (ID)
)^
-- end SRVCAT_AGREEMENT_PARAMS
-- begin SRVCAT_AGREEMENT_CONFIRM
create table SRVCAT_AGREEMENT_CONFIRM (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TYPE_AGREEMENT_ID varchar(36),
    USER varchar(255),
    SERVICE_ID varchar(36),
    --
    primary key (ID)
)^
-- end SRVCAT_AGREEMENT_CONFIRM
-- begin SRVCAT_AGREEMENT_REQUEST
create table SRVCAT_AGREEMENT_REQUEST (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TYPE_AGREEMENT_ID varchar(36),
    USER varchar(255),
    SERVICE_ID varchar(36),
    --
    primary key (ID)
)^
-- end SRVCAT_AGREEMENT_REQUEST
-- begin SRVCAT_TYPE_AGREEMENT
create table SRVCAT_TYPE_AGREEMENT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    LIABILITY_OWNER varchar(255),
    LIABILITY_ORG varchar(255),
    SERVICE_ID varchar(36),
    --
    primary key (ID)
)^
-- end SRVCAT_TYPE_AGREEMENT
-- begin SRVCAT_SERVICE_TEAM
create table SRVCAT_SERVICE_TEAM (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PARTICIPANT varchar(255),
    SERVICE_ID varchar(36),
    --
    primary key (ID)
)^
-- end SRVCAT_SERVICE_TEAM
