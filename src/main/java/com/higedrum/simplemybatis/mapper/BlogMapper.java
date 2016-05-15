package com.higedrum.simplemybatis.mapper;

import com.higedrum.simplemybatis.entity.Blog;

/**
 * Created by koji on 2016/05/14.
 */
public interface BlogMapper {
    Blog selectBlog(int id);
}
