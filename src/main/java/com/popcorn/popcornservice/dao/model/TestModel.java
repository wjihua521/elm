package com.popcorn.popcornservice.dao.model;

import java.io.Serializable;
import java.util.Date;

public class TestModel implements Serializable {
    private Long id;
    private String name;
    private Date insertDate;

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

    public Date getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Date insertDate) {
        this.insertDate = insertDate;
    }
}
