package com.zxc.community.util;

public interface CommunityConstant {

    /**
     * 激活成功
     */
    int ACTIVATION_SUCCESS = 0;

    /**
     * 重复激活
     */
    int ACTIVATION_REPEAT = 1;

    /**
     * 激活失败
     */
    int ACTIVATION_FAILURE = 2;


    /**
     * 默认登录凭证的超时时间 (没有勾选remember me )
     */
    int DEFAULT_EXPIRED_SECOND = 3600*12;

    /**
     * 记住状态下的登录凭证超时时间
     */
    int REMEMBERME_EXPIRED_SECOND = 3600*24*30;

    /**
     * 实体类型: 帖子
     */
    int ENTITY_TYPE_POST = 1;

    /**
     * 实体类型: 评论
     */
    int ENTITY_TYPE_COMMENT = 2;

    /**
     * 实体类型: USER
     */
    int ENTITY_TYPE_USER = 3;

    /**
     * 主题评论
     */
    String TOPIC_COMMENT = "comment";

    /**
     * 主题点赞
     */
    String TOPIC_LIKE = "like";

    /**
     * 主题关注
     */
    String TOPIC_FOLLOW = "follow";

    /**
     * 系统用户
     */
    int SYSTEM_USER_ID = 1;
}
