package com.guavasoft.zamlocale.models;

import com.guavasoft.zamlocale.contracts.AbstractEntity;
import jakarta.persistence.*;

@Entity
public class Street extends AbstractEntity  {
    @Column(name = "Name", nullable = false)
    private String name;
    @ManyToOne
    private City city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
