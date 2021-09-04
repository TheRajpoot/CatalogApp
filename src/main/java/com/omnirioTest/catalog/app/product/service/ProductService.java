package com.omnirioTest.catalog.app.product.service;

import com.omnirioTest.catalog.app.attribute.entity.Attribute;
import com.omnirioTest.catalog.app.attribute.entity.AttributeSerializer;
import com.omnirioTest.catalog.app.attribute.repository.AttributeRepository;
import com.omnirioTest.catalog.app.category.entity.Category;
import com.omnirioTest.catalog.app.category.entity.CategoryProduct;
import com.omnirioTest.catalog.app.category.entity.CategorySerializer;
import com.omnirioTest.catalog.app.category.repository.CategoryProductRepository;
import com.omnirioTest.catalog.app.category.repository.CategoryRepository;
import com.omnirioTest.catalog.app.product.entity.Product;
import com.omnirioTest.catalog.app.product.entity.ProductRequest;
import com.omnirioTest.catalog.app.product.entity.ProductSerializer;
import com.omnirioTest.catalog.app.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    @Autowired
    AttributeRepository attributeRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    CategoryProductRepository categoryProductRepository;

    public ProductSerializer saveProduct(ProductRequest product) {
        Product pro = new Product();
        pro.setName(product.getName());
        Product pro1 = productRepository.save(pro);
        Category category = categoryRepository.getById(product.getCatId());
        CategoryProduct catProduct = new CategoryProduct();
        catProduct.setProductId(pro1.getId());
        catProduct.setCategoryId(category.getId());
        categoryProductRepository.save(catProduct);
        return new ProductSerializer(pro1.getId(),pro1.getName(),new CategorySerializer(category.getId(),category.getName()));
    }

    public ProductSerializer getProduct(Long id) {
        Optional<Product> product = Optional.of(productRepository.getById(id));
        List<Category> cateList = categoryProductRepository.getCategoryByProductId(id);
       return new ProductSerializer(product.get().getId(),product.get().getName(), new CategorySerializer(cateList.get(0).getId(),cateList.get(0).getName()));
    }

    public List<AttributeSerializer> findProductAttributes(Long id) {
        List<Attribute> attrs = attributeRepository.getByEntityIdAndEntityType(id,"Product");
        List<AttributeSerializer> list=new ArrayList<>();
        for(Attribute attribute1 : attrs){
            list.add(new AttributeSerializer(attribute1.getEntityId(),attribute1.getName(),attribute1.getValue(),attribute1.getEntityId(),attribute1.getEntityName()));
        }
        System.out.println(attrs);
        return list;
    }
}
