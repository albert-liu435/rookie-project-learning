/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 50737
 Source Host           : localhost:3306
 Source Schema         : mp

 Target Server Type    : MySQL
 Target Server Version : 50737
 File Encoding         : 65001

 Date: 21/04/2022 11:09:39
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tbl_employee
-- ----------------------------
DROP TABLE IF EXISTS `tbl_employee`;
CREATE TABLE `tbl_employee`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `last_name` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `email` varchar(50) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `gender` char(1) CHARACTER SET latin1 COLLATE latin1_swedish_ci NULL DEFAULT NULL,
  `age` int(11) NULL DEFAULT NULL,
  `d_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tbl_employee
-- ----------------------------
INSERT INTO `tbl_employee` VALUES (1, 'Tom', 'jerry@atguigu.com', '1', 22, 1);
INSERT INTO `tbl_employee` VALUES (2, 'Jerry', 'jerry@atguigu.com', '0', 25, 1);
INSERT INTO `tbl_employee` VALUES (3, 'Black', 'black@atguigu.com', '1', 30, 2);
INSERT INTO `tbl_employee` VALUES (4, 'White', 'white@atguigu.com', '0', 35, 2);
INSERT INTO `tbl_employee` VALUES (5, 'jerry4', NULL, '1', NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
