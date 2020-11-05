package com.feri.cloudlike.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * projectName: likedemo
 * author: 张宁
 * time: 2020/11/4 16:30
 * description:
 */
@Data
@NoArgsConstructor
public class Cart implements Serializable {
    private Integer id;
    private Integer uid;
    private Integer skuid;
    private Integer scount;
    private Integer jprice;
    private Data ctime;

    public Cart(Integer uid, Integer skuid, Integer scount, Integer jprice) {
        this.uid = uid;
        this.skuid = skuid;
        this.scount = scount;
        this.jprice = jprice;
    }
}
