package com.omnirioTest.catalog.app.category.controller;

import com.omnirioTest.catalog.app.attribute.entity.AttributeSerializer;
import com.omnirioTest.catalog.app.category.entity.Category;
import com.omnirioTest.catalog.app.category.entity.CategorySerializer;
import com.omnirioTest.catalog.app.category.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @GetMapping("/{id}")
    public CategorySerializer findCategory(@PathVariable("id") Long id){
        return categoryService.getCategory(id);
    }

    @GetMapping("/{id}/attributes")
    public List<AttributeSerializer> findCategoryAttributes(@PathVariable("id") Long id){
        return categoryService.getCategoryAttributes(id);
    }
    @PostMapping("/")
    public Category saveCategory(@RequestBody Category category){
        return categoryService.saveCategory(category);
    }
}
