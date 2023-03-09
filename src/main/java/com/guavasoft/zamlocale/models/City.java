package com.guavasoft.zamlocale.models;
import com.guavasoft.zamlocale.contracts.AbstractEntity;

public class City extends AbstractEntity {
    // class attributes
    private  String name;
    private  long provinceId;

    // getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getProvinceId() {
        return provinceId;
    }
    public void setProvinceId(long provinceId) {
        this.provinceId = provinceId;
    }

}
