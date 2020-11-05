package com.feri.cloudlike.common.util;


/**
 * projectName: likedemo
 * author: 张宁
 * time: 2020/11/3 14:55
 * description:
 */
public class IdGeneratorSinglon {
    private IdGeneratorSinglon(){
        generator=new IdGenerator();
    }
    private static IdGeneratorSinglon singlon=new IdGeneratorSinglon();
    public IdGenerator generator;
    public static IdGeneratorSinglon getInstance(){
        return singlon;
    }
}
