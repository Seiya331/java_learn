package com.zgj.study.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author lyle
 * @since 2019-11-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("vedio_message")
public class VedioMessage implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 视频名称
     */
    private String vedioName;

    /**
     * 视频封面路径
     */
    private String vedioImgUrl;

    /**
     * 视频分类(电影：1，电视剧：2)
     */
    private String vedioType;

    /**
     * 视频路径
     */
    private String vedioUrl;


}
