package com.guavasoft.zamlocale.models;
import com.guavasoft.zamlocale.contracts.AbstractEntity;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class City extends AbstractEntity {
    // class attributes
    @Column(name="Name", nullable=false)
    private  String name;

    public List<Street> getStreets() {
        return streets;
    }

    public void setStreets(List<Street> streets) {
        this.streets = streets;
    }

    @OneToMany
    @JoinTable(name = "Street")
    private List<Street> streets;
    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }

    @ManyToOne
    private  Province province;
    // getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
