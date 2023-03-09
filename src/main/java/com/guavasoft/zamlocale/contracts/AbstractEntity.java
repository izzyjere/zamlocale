package com.guavasoft.zamlocale.contracts;

import jakarta.annotation.Generated;
import org.springframework.cglib.core.GeneratorStrategy;
import org.springframework.data.annotation.Id;

public abstract class AbstractEntity {
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Id
    private  long id;
}
