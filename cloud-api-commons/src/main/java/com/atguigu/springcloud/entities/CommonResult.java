package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Auther: 范人介
 * @Date: 2020/6/13
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T Data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
