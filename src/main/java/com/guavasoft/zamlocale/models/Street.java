package com.guavasoft.zamlocale.models;

import com.guavasoft.zamlocale.contracts.AbstractEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "Street")
public class Street extends AbstractEntity  {

    private String name;
    @ManyToOne
    @JoinColumn(name="city_id")
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
