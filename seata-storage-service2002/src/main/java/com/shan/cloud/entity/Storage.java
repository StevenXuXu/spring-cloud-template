package com.shan.cloud.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * @TableName t_storage
 */
@TableName(value ="t_storage")
@Data
public class Storage implements Serializable {
    private Long id;

    private Long productId;

    private Integer total;

    private Integer used;

    private Integer residue;

    private static final long serialVersionUID = 1L;
}