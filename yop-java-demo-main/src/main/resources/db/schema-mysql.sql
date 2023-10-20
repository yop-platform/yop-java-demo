-- 用户表
DROP TABLE IF EXISTS `tbl_user`;
CREATE TABLE `tbl_user`
(
    `id`           varchar(32) COMMENT '用户id',
    `name`         varchar(32) COMMENT '用户名称',
    `type`         varchar(16) COMMENT '用户类型',
    `id_card_type` varchar(16) COMMENT '证件类型',
    `card_no`      varchar(32) COMMENT '证件号',
    `phone`        varchar(32) COMMENT '银行预留手机号',
    `gmt_create`   datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `gmt_modified` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '最后修改时间',
    PRIMARY KEY (`id`)
);

-- 商品表
DROP TABLE IF EXISTS `tbl_goods`;
CREATE TABLE `tbl_goods`
(
    `id`           varchar(32) COMMENT '商品id',
    `name`         varchar(32) COMMENT '商品名称',
    `price`        decimal(10, 2) COMMENT '商品价格',
    `gmt_create`   datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `gmt_modified` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '最后修改时间',
    PRIMARY KEY (`id`)
);

-- 订单表
DROP TABLE IF EXISTS `tbl_order`;
CREATE TABLE `tbl_order`
(
    `id`                 varchar(32) COMMENT '订单id',
    `user_id`            varchar(32) COMMENT '用户标识',
    `parent_merchant_no` varchar(32) COMMENT '父商编',
    `merchant_no`        varchar(32) COMMENT '子商编',
    `status`             varchar(32) COMMENT '订单状态',
    `price`              decimal(10, 2) COMMENT '订单价格',
    `token`              varchar(64) COMMENT '订单token',
    `gmt_create`         datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
    `gmt_modified`       datetime DEFAULT CURRENT_TIMESTAMP COMMENT '最后修改时间',
    PRIMARY KEY (`id`)
);
