package com.group6.blog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author 朱虹运20221103
 * @since 2022-11-03
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Blog implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * Primary Key
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String blogTitle;

    private String blogContent;

    private String blogTypes;

    private String blogAuthor;


}
