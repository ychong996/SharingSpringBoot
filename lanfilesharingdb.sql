/*
 Navicat Premium Data Transfer

 Source Server         : ychong
 Source Server Type    : MySQL
 Source Server Version : 50729
 Source Host           : localhost:3306
 Source Schema         : lanfilesharingdb

 Target Server Type    : MySQL
 Target Server Version : 50729
 File Encoding         : 65001

 Date: 03/07/2020 18:26:50
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for fs_file
-- ----------------------------
DROP TABLE IF EXISTS `fs_file`;
CREATE TABLE `fs_file`  (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `local_path` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `remote_path` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `file_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of fs_file
-- ----------------------------
INSERT INTO `fs_file` VALUES (1, '11.txt', NULL, '', '.txt');
INSERT INTO `fs_file` VALUES (2, '2.txt', NULL, NULL, '.txt');
INSERT INTO `fs_file` VALUES (3, '3.txt', NULL, NULL, '.txt');
INSERT INTO `fs_file` VALUES (4, '4.txt', NULL, NULL, '.txt');
INSERT INTO `fs_file` VALUES (5, '5.txt', NULL, NULL, '.txt');
INSERT INTO `fs_file` VALUES (6, '6.txt', NULL, NULL, '.txt');
INSERT INTO `fs_file` VALUES (7, '111111.doc', NULL, NULL, '.doc');
INSERT INTO `fs_file` VALUES (8, '222222.docx', NULL, NULL, '.docx');
INSERT INTO `fs_file` VALUES (9, '333333.ppt', NULL, NULL, '.ppt');
INSERT INTO `fs_file` VALUES (10, '444444.pptx', NULL, NULL, '.pptx');
INSERT INTO `fs_file` VALUES (11, '555555.rtf', NULL, NULL, '.rtf');
INSERT INTO `fs_file` VALUES (12, '666666.xls', NULL, NULL, '.xls');
INSERT INTO `fs_file` VALUES (13, '777777.xlsx', NULL, NULL, '.xlsx');

-- ----------------------------
-- Table structure for fs_menu
-- ----------------------------
DROP TABLE IF EXISTS `fs_menu`;
CREATE TABLE `fs_menu`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of fs_menu
-- ----------------------------
INSERT INTO `fs_menu` VALUES (0, 'ftp管理');
INSERT INTO `fs_menu` VALUES (1, '测试菜单');
INSERT INTO `fs_menu` VALUES (2, '测试菜单1');
INSERT INTO `fs_menu` VALUES (3, '测试菜单2');
INSERT INTO `fs_menu` VALUES (4, 'Test Menu1');
INSERT INTO `fs_menu` VALUES (5, 'Test Menu2');

-- ----------------------------
-- Table structure for fs_user
-- ----------------------------
DROP TABLE IF EXISTS `fs_user`;
CREATE TABLE `fs_user`  (
  `id` int(100) NOT NULL AUTO_INCREMENT,
  `account` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `ftp_ip` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `ftp_port` int(255) DEFAULT NULL,
  `ftp_account` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `ftp_password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of fs_user
-- ----------------------------
INSERT INTO `fs_user` VALUES (1, 'ychong0', '123456', '192.168.0.143', 21, 'ftpychong', '123456');
INSERT INTO `fs_user` VALUES (2, 'ychong1', '123456', '192.168.0.143', 21, 'ftpychong', '123456');
INSERT INTO `fs_user` VALUES (4, 'ychong2', '123456', '192.168.0.143', 21, 'ftpychong', '123456');
INSERT INTO `fs_user` VALUES (5, 'ychong3', '123456', '192.168.0.143', 21, 'ftpychong', '123456');

SET FOREIGN_KEY_CHECKS = 1;
