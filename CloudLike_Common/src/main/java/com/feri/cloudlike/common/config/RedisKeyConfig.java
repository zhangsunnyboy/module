package com.feri.cloudlike.common.config;

/**
 * projectName: likedemo
 * author: 张宁
 * time: 2020/11/2 14:56
 * description:
 */
public class RedisKeyConfig {
    //记录点赞的内容  ZSet
    public static String LIKE_UID="like:";//cit
    //点赞热点数据 有效期三个月
    public static int LIKE_TIME=90;

    //购物车相关
    public static String CART_UID="cart:user:";//uid
    //购物车数据 有效期24小时
    public static int CART_TIME=24;
}
