package com.omnirioTest.catalog.app.product.entity;

import com.omnirioTest.catalog.app.category.entity.Category;
import com.omnirioTest.catalog.app.category.entity.CategorySerializer;

import java.io.Serializable;

public class ProductSerializer implements Serializable {
    private static final long serialVersionUID = 7829136421241572265L;
    private Long id;
    private String name;
    private CategorySerializer category;

    public ProductSerializer(){}
    public ProductSerializer(Long id, String name, CategorySerializer category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    public CategorySerializer getCategory() {
        return category;
    }

    public void setCategory(CategorySerializer category) {
        this.category = category;
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
