-- Records of tbl_user
INSERT INTO `tbl_user`(id, name, type, id_card_type, card_no, phone)
VALUES ('user_10001', '测试001', 'USER_ID', 'ID', 'your cardNo', 'your phone');

-- Records of tbl_goods
INSERT INTO `tbl_goods`(id, name, price)
VALUES ('goods_10001', '苹果', 1);
INSERT INTO `tbl_goods`(id, name, price)
VALUES ('goods_10002', '西瓜', 0.5);
INSERT INTO `tbl_goods`(id, name, price)
VALUES ('goods_10003', '手机', 2);
INSERT INTO `tbl_goods`(id, name, price)
VALUES ('goods_10004', '电脑', 1.5);
INSERT INTO `tbl_goods`(id, name, price)
VALUES ('goods_10005', '衣服', 0.01);
INSERT INTO `tbl_goods`(id, name, price)
VALUES ('goods_10006', '裤子', 1.11);

-- Records of tbl_order
INSERT INTO `tbl_order`(id, user_id, parent_merchant_no, merchant_no, status, price, token)
VALUES ('order_20231010_001', 'user_10001', '10080041523', '10080041523', '', '0.01', '');