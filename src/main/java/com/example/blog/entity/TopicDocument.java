package com.example.blog.entity;

import jakarta.persistence.*;

@Entity
@Table(name="TopicsDocuments")
public class TopicDocument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="topicId")
    private int topicId;

    @Column(name="documentId")
    private int documentId;

    public TopicDocument() {
    }

    public TopicDocument(int topicId, int documentId) {
        this.topicId = topicId;
        this.documentId = documentId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTopicId() {
        return topicId;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }

    public int getDocumentId() {
        return documentId;
    }

    public void setDocumentId(int documentId) {
        this.documentId = documentId;
    }

    @Override
    public String toString() {
        return "TopicDocument{" +
                "id=" + id +
                ", topicId=" + topicId +
                ", documentId=" + documentId +
                '}';
    }
}
