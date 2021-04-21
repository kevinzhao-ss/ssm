/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50724
Source Host           : localhost:3306
Source Database       : ssm_demo

Target Server Type    : MYSQL
Target Server Version : 50724
File Encoding         : 65001

Date: 2021-04-21 15:13:34
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user_address
-- ----------------------------
DROP TABLE IF EXISTS `user_address`;
CREATE TABLE `user_address` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` int(11) DEFAULT NULL COMMENT '用户id',
  `addr_country` varchar(255) DEFAULT NULL COMMENT '国家',
  `addr_province` varchar(255) DEFAULT NULL COMMENT '省份',
  `addr_city` varchar(255) DEFAULT NULL COMMENT '城市',
  `addr_county` varchar(255) DEFAULT NULL COMMENT '区',
  `addr_detail` varchar(255) DEFAULT NULL COMMENT '详细地址',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注信息',
  `create_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT 'CURRENT_TIMESTAMP',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT 'CURRENT_TIMESTAMP',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='用户地址';

-- ----------------------------
-- Records of user_address
-- ----------------------------
INSERT INTO `user_address` VALUES ('1', '1', '中国', '湖南省', '长沙市', '岳麓区', '企业广场A座', '公司地址', '2021-04-21 14:02:28', '2021-04-21 14:02:28');
INSERT INTO `user_address` VALUES ('2', '1', '中国', '湖南省', '长沙市', '岳麓区', '中电软件园12栋', '外卖地址', '2021-04-21 14:02:58', '2021-04-21 14:02:58');
INSERT INTO `user_address` VALUES ('3', '2', '中国', '广东省', '东菀市', '某某区', '某某小区', '', '2021-04-21 14:03:40', '2021-04-21 14:03:40');
