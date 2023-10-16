package com.example.blog.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="documents")
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="title")
    private String title;

    @Column(name="content")
    private String content;

    @Column(name="department")
    private String department;

    @Column(name="author")
    private String author;

    @Column(name="published")
    private Boolean published;

    @Column(name="publishedAt")
    private Date publishedAt;

    @Column(name="updatedAt")
    private Date updatedAt;

    @Column(name="kind")
    private String kind;

    @Column(name="visibleTo")
    private String visibleTo;

    @Column(name="likeCount")
    private int likeCount;

    @Column(name="visitCount")
    private int visitCount;

    public Document() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Boolean getPublished() {
        return published;
    }

    public void setPublished(Boolean published) {
        this.published = published;
    }

    public Date getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(Date publishedAt) {
        this.publishedAt = publishedAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getVisibleTo() {
        return visibleTo;
    }

    public void setVisibleTo(String visibleTo) {
        this.visibleTo = visibleTo;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }

    public int getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(int visitCount) {
        this.visitCount = visitCount;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", department='" + department + '\'' +
                ", author='" + author + '\'' +
                ", published=" + published +
                ", publishedAt=" + publishedAt +
                ", updatedAt=" + updatedAt +
                ", kind='" + kind + '\'' +
                ", visibleTo='" + visibleTo + '\'' +
                ", likeCount=" + likeCount +
                ", visitCount=" + visitCount +
                '}';
    }
}
