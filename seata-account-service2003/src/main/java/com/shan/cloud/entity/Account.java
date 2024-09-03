package com.shan.cloud.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * @TableName t_account
 */
@TableName(value ="t_account")
@Data
public class Account implements Serializable {
    private Long id;

    private Long userId;

    private Integer total;

    private Integer used;

    private Integer residue;

    private static final long serialVersionUID = 1L;
}