package com.guavasoft.zamlocale.services.imp;

import com.guavasoft.zamlocale.models.City;
import com.guavasoft.zamlocale.services.ICityService;
import com.guavasoft.zamlocale.services.IService;
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
    public boolean create(City entity) {
        return false;
    }

    @Override
    public boolean deleteById(long id) {
        return false;
    }

    @Override
    public boolean update(City entity) {
        return false;
    }
}
