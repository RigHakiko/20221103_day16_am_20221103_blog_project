package com.group6.blog.service.impl;

import com.group6.blog.entity.Blog;
import com.group6.blog.mapper.BlogMapper;
import com.group6.blog.service.IBlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 朱虹运20221103
 * @since 2022-11-03
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements IBlogService {

}
