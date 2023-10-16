package com.example.blog.entity;

import jakarta.persistence.*;

//@Data
@Entity
@Table(name="sections")
public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="documentId")
    private int documentId;

    @Column(name="chapterId")
    private int chapterId;

    @Column(name="positionIdx")
    private int position;

    @Column(name="title")
    private String title;

    @Column(name="content")
    private String content;

    @Column(name="optional")
    private Boolean optional;



    public Section() {
    }

    public Section(int documentId, int chapterId, int position, String title, String content, Boolean optional) {
        this.documentId = documentId;
        this.chapterId = chapterId;
        this.position = position;
        this.title = title;
        this.content = content;
        this.optional = optional;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDocumentId() {
        return documentId;
    }

    public void setDocumentId(int documentId) {
        this.documentId = documentId;
    }

    public int getChapterId() {
        return chapterId;
    }

    public void setChapterId(int chapterId) {
        this.chapterId = chapterId;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
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

    public Boolean getOptional() {
        return optional;
    }

    public void setOptional(Boolean optional) {
        this.optional = optional;
    }

    @Override
    public String toString() {
        return "Section{" +
                "id=" + id +
                ", documentId=" + documentId +
                ", chapterId=" + chapterId +
                ", position=" + position +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", optional=" + optional +
                '}';
    }
}
