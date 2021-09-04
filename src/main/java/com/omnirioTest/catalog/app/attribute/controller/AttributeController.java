package com.omnirioTest.catalog.app.attribute.controller;

import com.omnirioTest.catalog.app.attribute.entity.Attribute;
import com.omnirioTest.catalog.app.attribute.entity.AttributeSerializer;
import com.omnirioTest.catalog.app.attribute.service.AttributeService;
import com.omnirioTest.catalog.app.category.entity.Category;
import com.omnirioTest.catalog.app.category.entity.CategorySerializer;
import com.omnirioTest.catalog.app.category.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/attributes")
public class AttributeController {
    @Autowired
    AttributeService attributeService;

    @GetMapping("/{id}")
    public AttributeSerializer findAttribute(@PathVariable("id") Long id){
        return attributeService.getAttribute(id);
    }
    @PostMapping("/")
    public AttributeSerializer saveCategory(@RequestBody Attribute attribute){

        return attributeService.saveAttribute(attribute);
    }

}
