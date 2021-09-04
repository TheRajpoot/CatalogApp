package com.omnirioTest.catalog.app.product.controller;

import com.omnirioTest.catalog.app.attribute.entity.AttributeSerializer;
import com.omnirioTest.catalog.app.category.entity.CategorySerializer;
import com.omnirioTest.catalog.app.product.entity.Product;
import com.omnirioTest.catalog.app.product.entity.ProductRequest;
import com.omnirioTest.catalog.app.product.entity.ProductSerializer;
import com.omnirioTest.catalog.app.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("/")
    public ProductSerializer saveProduct(@RequestBody ProductRequest product){
        return productService.saveProduct(product);
    }

    @GetMapping("/{id}/attributes")
    public List<AttributeSerializer> findProductAttributes(@PathVariable("id") Long id){
        return productService.findProductAttributes(id);
    }

    @GetMapping("/{id}")
    public ProductSerializer findCategory(@PathVariable("id") Long id){
        return productService.getProduct(id);
    }
}
