package com.hknyildz.FoodApplication.model;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Food {

    private Integer id;

    private String title;

    private String description;

    private String createDate;

    private String lastModifiedDate;

    private final List<String> list = new ArrayList<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public List<String> getList() {
        return list;
    }
}
