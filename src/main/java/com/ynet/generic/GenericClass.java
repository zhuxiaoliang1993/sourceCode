package com.ynet.generic;

import lombok.Data;

// 使用lombok生成get set方法
@Data
public class GenericClass<MVP>{
    // 没有MVP类型 这里代表的是一种未知类型 未来在使用时传递的什么类型就是什么类型
    private  MVP mvp;
}
