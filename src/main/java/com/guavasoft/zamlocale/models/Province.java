package com.guavasoft.zamlocale.models;

import com.guavasoft.zamlocale.contracts.AbstractEntity;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Province extends AbstractEntity {
    @Column(name = "Name", nullable = false)
    private  String name;
    @OneToMany
    @JoinTable(name = "City")
    private List<City> cities;

    public String getName() {
        return name;
    }

    public List<City> getCities() {
        return cities;
    }
    public void setCities(List<City> cities) {
        this.cities = cities;
    }

    public void setName(String name) {
        this.name = name;
    }
}
