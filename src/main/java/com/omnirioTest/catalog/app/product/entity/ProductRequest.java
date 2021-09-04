package com.omnirioTest.catalog.app.product.entity;

public class ProductRequest {

    private String name;
    private Long catId;

    public ProductRequest(){}

    public ProductRequest(String name, Long catId) {
        this.name = name;
        this.catId = catId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCatId() {
        return catId;
    }

    public void setCatId(Long catId) {
        this.catId = catId;
    }
}
