package com.guavasoft.zamlocale.contracts;
import jakarta.persistence.*;
import jakarta.persistence.MappedSuperclass;


@MappedSuperclass
public abstract class AbstractEntity {
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
}
