package com.example.blog.entity;

import jakarta.persistence.*;

@Entity
@Table(name="CategoriesUsers")
public class CategoryUser {
    @Id // TODO: verified: ID required
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="categoryId")
    private int categoryId;

    @Column(name="userId")
    private int userId;

    public CategoryUser() {
    }

    public CategoryUser(int categoryId, int userId) {
        this.categoryId = categoryId;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "CategoryUser{" +
                "id=" + id +
                ", categoryId=" + categoryId +
                ", userId=" + userId +
                '}';
    }
}
