package com.feri.cloudlike.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * projectName: likedemo
 * author: 张宁
 * time: 2020/11/3 14:51
 * description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MqMsgDto {
    private long id;//唯一id
    private int type;//消息类型
    private Object data;//消息的内容
}
