package com.higedrum.simplemybatis.entity;

/**
 * Created by koji on 2016/05/14.
 */
public class Blog {
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
