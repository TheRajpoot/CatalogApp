package com.omnirioTest.catalog.app.category.entity;

import java.io.Serializable;

public class CategorySerializer implements Serializable {
    private static final long serialVersionUID = 7829136421241571165L;
    private Long id;
    private String name;

    public CategorySerializer(){}
    public CategorySerializer(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
