package com.guavasoft.zamlocale.models;

import com.guavasoft.zamlocale.contracts.AbstractEntity;
import jakarta.persistence.*;

@Entity
public class Street extends AbstractEntity  {
    @Column(name = "Name", nullable = false)
    private String name;
    @Column(name = "CityId")
    private  long cityId;
    @ManyToOne
    @JoinColumn(name = "CityId")
    private City city;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCityId() {
        return cityId;
    }

    public void setCityId(long cityId) {
        this.cityId = cityId;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
