/*
Navicat MySQL Data Transfer

Source Server         : MySQL01
Source Server Version : 80021
Source Host           : 192.168.10.6:3306
Source Database       : user_info

Target Server Type    : MYSQL
Target Server Version : 80021
File Encoding         : 65001

Date: 2020-09-01 20:54:32
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user_tbl
-- ----------------------------
DROP TABLE IF EXISTS `user_tbl`;
CREATE TABLE `user_tbl` (
  `id` int(5) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `age` int(3) unsigned zerofill DEFAULT NULL,
  `job` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
