package com.omnirioTest.catalog.app.attribute.service;

import com.omnirioTest.catalog.app.attribute.entity.AttributeSerializer;
import com.omnirioTest.catalog.app.attribute.entity.Attribute;
import com.omnirioTest.catalog.app.attribute.repository.AttributeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttributeService {
    @Autowired
    AttributeRepository attributeRepository;

    public AttributeSerializer saveAttribute(Attribute attribute) {
        Attribute attribute1 = attributeRepository.save(attribute);
        return new AttributeSerializer(attribute1.getEntityId(),attribute1.getName(),attribute1.getValue(),attribute1.getEntityId(),attribute1.getEntityName());
    }

    public AttributeSerializer getAttribute(Long id) {
        Attribute attribute1 = attributeRepository.getById(id);
        return new AttributeSerializer(attribute1.getEntityId(),attribute1.getName(),attribute1.getValue(),attribute1.getEntityId(),attribute1.getEntityName());

    }
}
