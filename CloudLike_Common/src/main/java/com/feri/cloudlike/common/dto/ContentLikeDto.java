package com.feri.cloudlike.common.dto;

import lombok.Data;

/**
 * projectName: likedemo
 * author: 张宁
 * time: 2020/10/30 17:37
 * description:
 */
@Data
public class ContentLikeDto {
    private Integer cid;
    private long ct;//点赞的数量
}
