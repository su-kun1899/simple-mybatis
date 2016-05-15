package com.higedrum.simplemybatis;

import com.higedrum.simplemybatis.entity.Blog;
import com.higedrum.simplemybatis.mapper.BlogMapper;
import com.higedrum.simplemybatis.service.BlogService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by koji on 2016/05/14.
 */
public class Main {

    public static void main(String[] args) {
        BlogService blogService = new BlogService();

        Blog blog = blogService.selectOne(1);
        System.out.println("id:" + blog.getId());
        System.out.println("name:" + blog.getName());
    }
}
