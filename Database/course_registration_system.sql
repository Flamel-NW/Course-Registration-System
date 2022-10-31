/*
 Navicat MySQL Data Transfer

 Source Server         : aliyun
 Source Server Type    : MySQL
 Source Server Version : 80030
 Source Host           : 39.105.32.103:3306
 Source Schema         : course_registration_system

 Target Server Type    : MySQL
 Target Server Version : 80030
 File Encoding         : 65001

 Date: 31/10/2022 21:22:11
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_course
-- ----------------------------
DROP TABLE IF EXISTS `tb_course`;
CREATE TABLE `tb_course`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `department` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `credit` int NOT NULL,
  `required` int NOT NULL,
  `year` int NOT NULL,
  `semester` int NOT NULL,
  `day` int NOT NULL,
  `lesson` int NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_course
-- ----------------------------
INSERT INTO `tb_course` VALUES (1, 'CS', 'depart01', 3, 1, 2022, 1, 1, 2);
INSERT INTO `tb_course` VALUES (2, 'math', 'depart02', 2, 1, 2023, 2, 3, 3);
INSERT INTO `tb_course` VALUES (3, 'English', 'depart03', 4, 1, 2022, 1, 2, 1);
INSERT INTO `tb_course` VALUES (4, 'CAD', 'depart07', 2, 0, 2021, 2, 2, 1);
INSERT INTO `tb_course` VALUES (5, 'JAVA', 'depart01', 4, 0, 2022, 1, 4, 4);
INSERT INTO `tb_course` VALUES (6, 'Algorithmns', 'depart01', 5, 1, 2022, 2, 5, 2);

-- ----------------------------
-- Table structure for tb_student
-- ----------------------------
DROP TABLE IF EXISTS `tb_student`;
CREATE TABLE `tb_student`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `password` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `department` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `sex` int NOT NULL,
  `phone_number` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `birth_date` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `graduation_date` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 9 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_student
-- ----------------------------
INSERT INTO `tb_student` VALUES (3, '张三', 'abcd1234', 'depart01', 0, '12345678', '2001-01-01', '2023-06-30');
INSERT INTO `tb_student` VALUES (4, '张四', 'bacd1234', 'depart01', 0, '22345678', '2000-01-01', '2022-06-30');
INSERT INTO `tb_student` VALUES (5, '张五', 'bcad1234', 'depart02', 1, '32345678', '2001-07-01', '2023-06-30');
INSERT INTO `tb_student` VALUES (6, '张六', 'bcda1234', 'depart03', 1, '42345678', '2001-02-01', '2023-06-30');
INSERT INTO `tb_student` VALUES (7, '张七', 'abcd2134', 'depart07', 0, '52345678', '2001-05-01', '2023-06-30');
INSERT INTO `tb_student` VALUES (8, '张八', 'abcd2234', 'depart02', 1, '62345678', '2001-01-08', '2023-06-30');

-- ----------------------------
-- Table structure for tb_student_to_course
-- ----------------------------
DROP TABLE IF EXISTS `tb_student_to_course`;
CREATE TABLE `tb_student_to_course`  (
  `sid` int NOT NULL,
  `cid` int NOT NULL,
  `score` int NULL DEFAULT NULL,
  PRIMARY KEY (`sid`, `cid`) USING BTREE,
  INDEX `cid`(`cid`) USING BTREE,
  CONSTRAINT `tb_student_to_course_ibfk_1` FOREIGN KEY (`sid`) REFERENCES `tb_student` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `tb_student_to_course_ibfk_2` FOREIGN KEY (`cid`) REFERENCES `tb_course` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_student_to_course
-- ----------------------------
INSERT INTO `tb_student_to_course` VALUES (3, 1, 85);
INSERT INTO `tb_student_to_course` VALUES (3, 5, 70);
INSERT INTO `tb_student_to_course` VALUES (4, 1, 90);
INSERT INTO `tb_student_to_course` VALUES (4, 2, 60);
INSERT INTO `tb_student_to_course` VALUES (5, 1, 95);
INSERT INTO `tb_student_to_course` VALUES (5, 2, 60);
INSERT INTO `tb_student_to_course` VALUES (6, 1, 95);
INSERT INTO `tb_student_to_course` VALUES (6, 2, 85);
INSERT INTO `tb_student_to_course` VALUES (7, 3, 77);
INSERT INTO `tb_student_to_course` VALUES (7, 4, 78);

-- ----------------------------
-- Table structure for tb_teacher
-- ----------------------------
DROP TABLE IF EXISTS `tb_teacher`;
CREATE TABLE `tb_teacher`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `password` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `department` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `sex` int NOT NULL,
  `phone_number` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `birth_date` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `salary` int NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_teacher
-- ----------------------------
INSERT INTO `tb_teacher` VALUES (1, '李一', 'bbbbbb', 'depart01', 1, '33456789', '1987-01-01', 13000);
INSERT INTO `tb_teacher` VALUES (2, '李二', 'cccccc', 'depart02', 1, '43456789', '1978-01-01', 8000);
INSERT INTO `tb_teacher` VALUES (4, '李四', 'aaaaaa', 'depart01', 0, '23456789', '1977-01-01', 10000);
INSERT INTO `tb_teacher` VALUES (5, '李五', 'dddddd', 'depart03', 0, '53456789', '1977-03-01', 8500);
INSERT INTO `tb_teacher` VALUES (6, '李六', 'eeeeee', 'depart07', 1, '623456789', '1977-05-01', 10000);
INSERT INTO `tb_teacher` VALUES (7, '李七', 'ffffff', 'depart02', 0, '73456789', '1977-07-01', 9000);

-- ----------------------------
-- Table structure for tb_teacher_to_course
-- ----------------------------
DROP TABLE IF EXISTS `tb_teacher_to_course`;
CREATE TABLE `tb_teacher_to_course`  (
  `tid` int NOT NULL,
  `cid` int NOT NULL,
  PRIMARY KEY (`cid`) USING BTREE,
  INDEX `tid`(`tid`) USING BTREE,
  CONSTRAINT `tb_teacher_to_course_ibfk_1` FOREIGN KEY (`tid`) REFERENCES `tb_teacher` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `tb_teacher_to_course_ibfk_2` FOREIGN KEY (`cid`) REFERENCES `tb_course` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tb_teacher_to_course
-- ----------------------------
INSERT INTO `tb_teacher_to_course` VALUES (1, 5);
INSERT INTO `tb_teacher_to_course` VALUES (2, 6);
INSERT INTO `tb_teacher_to_course` VALUES (4, 2);
INSERT INTO `tb_teacher_to_course` VALUES (4, 4);
INSERT INTO `tb_teacher_to_course` VALUES (5, 3);

-- ----------------------------
-- Procedure structure for create_tables
-- ----------------------------
DROP PROCEDURE IF EXISTS `create_tables`;
delimiter ;;
CREATE PROCEDURE `create_tables`()
BEGIN
	#Routine body goes here...
	DROP TABLE IF EXISTS tb_student_to_course;
	DROP TABLE IF EXISTS tb_teacher_to_course;
	DROP TABLE IF EXISTS tb_student;
	DROP TABLE IF EXISTS tb_course;
	DROP TABLE IF EXISTS tb_teacher;

	CREATE TABLE tb_student(
		id INT AUTO_INCREMENT,
		name VARCHAR(64) NOT NULL,
		password VARCHAR(32) NOT NULL,
		department VARCHAR(32) NOT NULL,
		sex INT NOT NULL,
		phone_number VARCHAR(32) NOT NULL,
		birth_date VARCHAR(32) NOT NULL,
		graduation_date VARCHAR(32) NOT NULL,
		
		PRIMARY KEY(id)
	);

	CREATE TABLE tb_teacher(
		id INT AUTO_INCREMENT,
		name VARCHAR(64) NOT NULL, 
		password VARCHAR(32) NOT NULL,
		department VARCHAR(32) NOT NULL,
		sex INT NOT NULL,
		phone_number VARCHAR(32) NOT NULL,
		birth_date VARCHAR(32) NOT NULL,
		salary INT NOT NULL,
		
		PRIMARY KEY(id)
	);

	CREATE TABLE tb_course(
		id INT AUTO_INCREMENT,
		name VARCHAR(64) NOT NULL,
		department VARCHAR(32) NOT NULL,
		credit INT NOT NULL,
		required INT NOT NULL,
		
		year INT NOT NULL,
		semester INT NOT NULL,                      -- 1为上半学期，2为下半学期
		day INT NOT NULL,                           -- 0为星期日
		lesson INT NOT NULL,                        -- 1-4为每天第几节课
		
		PRIMARY KEY(id)
	);

	CREATE TABLE tb_student_to_course(
		sid INT,
		cid INT,
		score INT,
		
		PRIMARY KEY(sid, cid),
		FOREIGN KEY(sid) REFERENCES tb_student(id),
		FOREIGN KEY(cid) REFERENCES tb_course(id)
	);

	CREATE TABLE tb_teacher_to_course(
		tid INT NOT NULL,
		cid INT,
		
		PRIMARY KEY(cid),
		FOREIGN KEY(tid) REFERENCES tb_teacher(id),
		FOREIGN KEY(cid) REFERENCES tb_course(id)
	);

END
;;
delimiter ;

SET FOREIGN_KEY_CHECKS = 1;
