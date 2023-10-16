package com.example.blog.entity;

import jakarta.persistence.*;

@Entity
@Table(name="CategoriesDocuments")
public class CategoryDocument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="categoryId")
    private int categoryId;

    @Column(name="documentId")
    private int documentId;

    public CategoryDocument() {
    }

    public CategoryDocument(int categoryId, int documentId) {
        this.categoryId = categoryId;
        this.documentId = documentId;
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

    public int getDocumentId() {
        return documentId;
    }

    public void setDocumentId(int documentId) {
        this.documentId = documentId;
    }

    @Override
    public String toString() {
        return "CategoryDocument{" +
                "id=" + id +
                ", categoryId=" + categoryId +
                ", documentId=" + documentId +
                '}';
    }
}
