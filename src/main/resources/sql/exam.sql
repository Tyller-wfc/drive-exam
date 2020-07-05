CREATE TABLE `NewTable` (
`id`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL ,
`exam_str`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`exam_url`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`opts`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`answer`  varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL ,
`type`  tinyint(4) NULL DEFAULT NULL ,
PRIMARY KEY (`id`)
)
ENGINE=InnoDB
DEFAULT CHARACTER SET=utf8 COLLATE=utf8_general_ci
ROW_FORMAT=DYNAMIC
;

INSERT INTO `exam` VALUES ('1', '1.驾驶机动车遇到非机动车违法在机动车道上行驶，并阻碍机动车前进时，以下做法错误的是什么？', NULL, 'A、注意非机动车辆的动向，减速行驶,B、谨慎驾驶低速通过,C、持续鸣喇叭警告非机动车避让,D、保持与非机动车安全车距', 'C', 0);
INSERT INTO `exam` VALUES ('2', '2.有这种信号灯的路口允许机动车如何行驶？', '2', 'A、向左转弯,B、直行通过,C、向右转弯,D、停车等待', 'A', 0);
INSERT INTO `exam` VALUES ('3', '3.在交叉路口、隧道内均不能倒车。', NULL, '正确,错误', '正确', 1);
INSERT INTO `exam` VALUES ('4', '4.如图所示，A车可以从左侧超越B车', '4', '正确,错误', '错误', 1);
