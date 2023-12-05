package com.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Employee {
    private static final long serialVersionUID=1l;
    private long id;
    private String name;
    private String username;
    private String password;
    private String phone;
    private String sex;
    private String idNumber;//身份证号码
    private Integer status;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    @TableField(fill = FieldFill.INSERT)
    private long createUser;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private long updateUser;


}
