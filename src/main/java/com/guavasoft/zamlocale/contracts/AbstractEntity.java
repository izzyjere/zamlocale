package com.guavasoft.zamlocale.contracts;

public abstract class AbstractEntity {
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private  long id;
}
