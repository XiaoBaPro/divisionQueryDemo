/*
 Navicat Premium Data Transfer

 Source Server         : Localhost
 Source Server Type    : MySQL
 Source Server Version : 80026
 Source Host           : localhost:3306
 Source Schema         : db_division_manage

 Target Server Type    : MySQL
 Target Server Version : 80026
 File Encoding         : 65001

 Date: 31/10/2022 15:47:20
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_demo
-- ----------------------------
DROP TABLE IF EXISTS `tb_demo`;
CREATE TABLE `tb_demo` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `created_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `ecu` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `descCn` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `descEn` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `vehicleModel` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `remark` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `dataOwner` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `diagOwner` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `partOwner` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `ruleOwner` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `serviceDevOwner` varchar(500) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3;

-- ----------------------------
-- Records of tb_demo
-- ----------------------------
BEGIN;
INSERT INTO `tb_demo` VALUES (1, '2022-10-28 17:13:32', 'ACU\r', '驻车执行机构模块\r', 'Actuator Control Unit\r', 'ALL\r', '\r', '薛志俊\r', '关敬\r', NULL, '吴子辰&金书彝\r', '王惠文&王婷婷&侯家俊\r');
INSERT INTO `tb_demo` VALUES (2, '2022-10-31 11:50:01', 'ALCM\r', '氛围灯控制模块\r', 'Ambient Lighting Control Module\r', 'ALL\r', 'End\r', '何纬悦\r', '付新亮\r', NULL, '李杰&杨雪&卢湘琦\r', '徐迅&郁晓健&胡冠雄&刘金标\r');
INSERT INTO `tb_demo` VALUES (3, '2022-10-31 12:41:53', 'AMP\r', '功率放大器\r', 'Amplifier\r', 'ALL\r', '\r', '张杰\r', '吕律赋&付新亮\r', NULL, '金杨&郭瑞\r', '王婷婷&倪术桃\r');
INSERT INTO `tb_demo` VALUES (4, '2022-10-31 12:54:20', 'AMR\r', '电动安全带\r', 'Active Motorized Retractor\r', 'ALL\r', '\r', '赵龙\r', '邹堃&何韵\r', NULL, '郭中傲&金杨\r', '侯家俊&胡冠雄\r');
INSERT INTO `tb_demo` VALUES (5, '2022-10-31 13:58:43', 'APA\r', '自动泊车控制系统\r', 'Auto Parking Assist System\r', 'ALL\r', '\r', '赵龙\r', '\r', NULL, '范俊华&郭中傲\r', '栾正斐&陈强\r');
INSERT INTO `tb_demo` VALUES (6, '2022-10-31 13:58:44', 'ASCM', '空气悬架', 'Air Suspension Control Module', 'ALL', '', '王露洁', '', NULL, '杨雪&钟瑶瑶&卢湘琦', '胡冠雄&倪术桃&王惠文');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
