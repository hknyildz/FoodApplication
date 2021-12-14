package com.hknyildz.FoodApplication.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "FOOD_TABLE")
@AllArgsConstructor
@NoArgsConstructor
public class FoodEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "DESCRPITION")
    private String description;
    @Column(name = "CREATEDATE")
    private Date createDate;

    @Lob
    @Column(name = "FOODDETAILS")
    private String foodDetails;

    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH})
    private UserEntity user;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getFoodDetails() {
        return foodDetails;
    }

    public void setFoodDetails(String foodDetails) {
        this.foodDetails = foodDetails;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}
