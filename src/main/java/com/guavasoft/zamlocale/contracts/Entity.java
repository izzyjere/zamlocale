package com.guavasoft.zamlocale.contracts;

import org.springframework.cglib.core.GeneratorStrategy;

public abstract class Entity {
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private  long id;
}
