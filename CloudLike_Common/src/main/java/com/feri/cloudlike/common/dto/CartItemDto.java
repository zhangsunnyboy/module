package com.feri.cloudlike.common.dto;

import lombok.Data;

/**
 * projectName: likedemo
 * author: 张宁
 * time: 2020/11/4 17:20
 * description:
 */
@Data
public class CartItemDto {
    private int id;
    private int count;//+ 正数  - 负数
}
