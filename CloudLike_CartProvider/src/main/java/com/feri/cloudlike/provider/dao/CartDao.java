package com.feri.cloudlike.provider.dao;

import com.feri.cloudlike.common.dto.CartAddDto;
import com.feri.cloudlike.entity.Cart;
import org.apache.ibatis.annotations.Select;

/**
 * projectName: likedemo
 * author: 张宁
 * time: 2020/11/4 17:52
 * description:
 */
public interface CartDao {
    //查询skuid 是否存在
    @Select("select * from t_cart where skuid=#{skuid} and uid=#{uid} limit 1")
    Cart queryByUid(CartAddDto dto);
}
