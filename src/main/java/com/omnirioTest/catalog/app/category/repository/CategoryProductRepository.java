package com.omnirioTest.catalog.app.category.repository;

import com.omnirioTest.catalog.app.attribute.entity.Attribute;
import com.omnirioTest.catalog.app.category.entity.Category;
import com.omnirioTest.catalog.app.category.entity.CategoryProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryProductRepository extends JpaRepository<CategoryProduct, Long> {
    @Query(value="select c.* from category_product cp inner join category c on c.id = cp.category_id where product_id=?1",nativeQuery = true)
    List<Category> getCategoryByProductId(Long id);
}
