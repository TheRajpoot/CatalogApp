package com.omnirioTest.catalog.app.attribute.entity;

public class AttributeSerializer {
    private static final long serialVersionUID = 7829136421241572165L;
    private Long id;
    private String name;
    private String value;
    private Long entityId;
    private String entityType;

    public AttributeSerializer(){};
    public AttributeSerializer(Long id, String name, String value, Long entityId, String entityType) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.entityId = entityId;
        this.entityType = entityType;
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

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Long getEntityId() {
        return entityId;
    }

    public void setEntityId(Long entityId) {
        this.entityId = entityId;
    }

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }
}
