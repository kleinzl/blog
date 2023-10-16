package com.example.blog.entity;

import jakarta.persistence.*;

@Entity
@Table(name="chapters")
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="documentId")
    private int documentId;

    @Column(name="positionIdx")
    private int position;

    @Column(name="title")
    private String title;

    @Column(name="content")
    private String content;

    @Column(name="optional")
    private Boolean optional;

    public Chapter() {
    }

    public Chapter(int documentId, int position, String title, String content, Boolean optional) {
        this.documentId = documentId;
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
        return "Chapter{" +
                "id=" + id +
                ", documentId=" + documentId +
                ", position=" + position +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", optional=" + optional +
                '}';
    }
}
