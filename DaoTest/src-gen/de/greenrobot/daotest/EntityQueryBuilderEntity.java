package de.greenrobot.daotest;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table ENTITY_QUERY_BUILDER_ENTITY.
 */
public class EntityQueryBuilderEntity {

    private Long id;
    private String text;
    private String text2;
    private Integer intprop;
    private int intprop2;
    private Integer intprop3;
    private Integer intprop4;

    public EntityQueryBuilderEntity() {
    }

    public EntityQueryBuilderEntity(Long id) {
        this.id = id;
    }

    public EntityQueryBuilderEntity(Long id, String text, String text2, Integer intprop, int intprop2, Integer intprop3, Integer intprop4) {
        this.id = id;
        this.text = text;
        this.text2 = text2;
        this.intprop = intprop;
        this.intprop2 = intprop2;
        this.intprop3 = intprop3;
        this.intprop4 = intprop4;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }

    public Integer getIntprop() {
        return intprop;
    }

    public void setIntprop(Integer intprop) {
        this.intprop = intprop;
    }

    public int getIntprop2() {
        return intprop2;
    }

    public void setIntprop2(int intprop2) {
        this.intprop2 = intprop2;
    }

    public Integer getIntprop3() {
        return intprop3;
    }

    public void setIntprop3(Integer intprop3) {
        this.intprop3 = intprop3;
    }

    public Integer getIntprop4() {
        return intprop4;
    }

    public void setIntprop4(Integer intprop4) {
        this.intprop4 = intprop4;
    }

}