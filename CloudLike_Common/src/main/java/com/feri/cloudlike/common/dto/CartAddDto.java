package com.feri.cloudlike.common.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * projectName: likedemo
 * author: 张宁
 * time: 2020/11/4 17:18
 * description:
 */
@Data
public class CartAddDto implements Serializable {
    private int skuid;
    private int uid;
    private int jprice;
    private int count;
}
