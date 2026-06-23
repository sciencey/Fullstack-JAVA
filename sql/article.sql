-- ----------------------------
-- 文章表 sys_article
-- ----------------------------
DROP TABLE IF EXISTS sys_article;
CREATE TABLE sys_article (
    article_id  bigint(20)   NOT NULL AUTO_INCREMENT COMMENT '文章ID',
    title       varchar(64)  NOT NULL                COMMENT '文章标题',
    content     text                                COMMENT '文章内容',
    status      char(1)      DEFAULT '0'             COMMENT '状态（0草稿 1发布）',
    create_by   varchar(64)  DEFAULT ''              COMMENT '创建者',
    create_time datetime     DEFAULT NULL            COMMENT '创建时间',
    update_by   varchar(64)  DEFAULT ''              COMMENT '更新者',
    update_time datetime     DEFAULT NULL            COMMENT '更新时间',
    remark      varchar(500) DEFAULT NULL            COMMENT '备注',
    PRIMARY KEY (article_id)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8mb4 COMMENT='文章表';

INSERT INTO sys_article (title, content, status, create_by, create_time)
VALUES ('全栈初体验', '手写若依增删改查，爽！', '1', 'admin', sysdate());

INSERT INTO sys_article (title, content, status, create_by, create_time)
VALUES ('若依框架学习心得', '从数据库到前端，一气呵成！', '0', 'admin', sysdate());
