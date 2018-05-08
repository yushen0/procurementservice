/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1_3306
Source Server Version : 50720
Source Host           : 127.0.0.1:3306
Source Database       : procurementservice

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-05-08 16:38:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` varchar(255) DEFAULT NULL COMMENT '用户ID',
  `username` varchar(255) NOT NULL COMMENT '用户名',
  `user_email` varchar(255) DEFAULT NULL COMMENT '邮箱账号',
  `user_telephone` varchar(255) NOT NULL COMMENT '手机号码',
  `password` varchar(255) NOT NULL COMMENT '登录密码',
  PRIMARY KEY (`username`,`user_telephone`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
