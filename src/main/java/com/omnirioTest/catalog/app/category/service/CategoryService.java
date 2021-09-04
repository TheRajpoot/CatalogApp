package com.omnirioTest.catalog.app.category.service;

import com.omnirioTest.catalog.app.attribute.entity.Attribute;
import com.omnirioTest.catalog.app.attribute.entity.AttributeSerializer;
import com.omnirioTest.catalog.app.attribute.repository.AttributeRepository;
import com.omnirioTest.catalog.app.category.entity.Category;
import com.omnirioTest.catalog.app.category.entity.CategorySerializer;
import com.omnirioTest.catalog.app.category.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    AttributeRepository attributeRepository;

    public CategorySerializer getCategory(Long id){
        Optional<Category> res = Optional.of(categoryRepository.getById(id));

        CategorySerializer ser = new CategorySerializer(res.get().getId(),res.get().getName());
        return ser;
    }
    public Category saveCategory(Category category){
       return categoryRepository.save(category);
    }

    public List<AttributeSerializer> getCategoryAttributes(Long id) {
        List<Attribute> attrs = attributeRepository.getByEntityIdAndEntityType(id,"Category");
        List<AttributeSerializer> list=new ArrayList<>();
        for(Attribute attribute1 : attrs){
            list.add(new AttributeSerializer(attribute1.getEntityId(),attribute1.getName(),attribute1.getValue(),attribute1.getEntityId(),attribute1.getEntityName()));
        }
        System.out.println(attrs);
        return list;
    }
}
