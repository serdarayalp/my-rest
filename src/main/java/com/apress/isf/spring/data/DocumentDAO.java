package com.apress.isf.spring.data;

import com.apress.isf.java.model.Document;

import java.util.List;

public interface DocumentDAO {
    public List<Document> getAll();

    public Document save(String id, Document document);

    public Document findById(String id);

    public Document removeById(String id);
}
