package com.guavasoft.zamlocale.services.imp;

import com.guavasoft.zamlocale.models.City;
import com.guavasoft.zamlocale.services.ICityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService implements ICityService {
    @Override
    public City getById(long id) {
        return null;
    }

    @Override
    public List<City> getAll() {
        return null;
    }

    @Override
    public City create(City entity) {
        return null;
    }

    @Override
    public boolean deleteById(long id) {
        return false;
    }

    @Override
    public City update(City entity, long id) {
        return null;
    }
}
