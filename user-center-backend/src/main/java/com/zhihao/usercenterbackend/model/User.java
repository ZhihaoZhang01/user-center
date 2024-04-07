package com.zhihao.usercenterbackend.model;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author Zhihao Zhang
 * @description TODO
 * @date 2024-04-06 6:09 PM
 */
@Data
@TableName("`user`")
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
