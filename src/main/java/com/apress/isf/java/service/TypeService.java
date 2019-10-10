/**
 *
 */
package com.apress.isf.java.service;

import com.apress.isf.java.model.Type;

import java.util.List;

public interface TypeService {
    public void createNewType(Type type);

    public void updateType(Type type);

    public void removeTypeById(String id);

    public List<Type> getAllDefinedTypes();

    public Type getTypeById(String id);
}
