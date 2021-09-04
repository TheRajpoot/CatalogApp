package com.omnirioTest.catalog.app.attribute.repository;

import com.omnirioTest.catalog.app.attribute.entity.Attribute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttributeRepository extends JpaRepository<Attribute, Long> {
    //select * from Attribute where entity_id=1 and entity_type='Category'
    @Query(value="SELECT * FROM attribute u WHERE u.entity_id = ?1 and u.entity_name = ?2",nativeQuery = true)
    List<Attribute> getByEntityIdAndEntityType(Long id, String category);
}
