package com.zgj.study.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author zgj
 * @since 2019-11-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName(value = "user",schema = "learn")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "uid", type = IdType.AUTO)
    private Integer uid;

    private String userName;

    private String password;

    private String realName;

    private Integer sflag;

    private Integer userLock;

    private String createDate;

    private String salt;


}
