package com.feri.cloudlike.entity;

import lombok.Data;

/**
 * projectName: likedemo
 * author: 张宁
 * time: 2020/10/30 17:28
 * description:
 */
@Data
public class Like {
    private Integer id;
    private Integer cid;
    private Integer uid;
    private Data ctime;
}
