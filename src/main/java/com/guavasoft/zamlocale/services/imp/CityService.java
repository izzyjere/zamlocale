package com.guavasoft.zamlocale.services.imp;

import com.guavasoft.zamlocale.data.CityRepository;
import com.guavasoft.zamlocale.models.City;
import com.guavasoft.zamlocale.services.ICityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService implements ICityService {
    private CityRepository repository;

    public CityService(CityRepository repository) {
        this.repository = repository;
    }

    @Override
    public City getById(long id) {
        var record = repository.findById(id);
        if(record.isPresent()){
            return record.get();
        }
        return null;
    }

    @Override
    public List<City> getAll() {
        return repository.findAll();
    }

    @Override
    public City create(City entity) {
        return repository.save(entity);
    }

    @Override
    public boolean deleteById(long id) {
        var record = getById(id);
        if(record!=null){
            repository.deleteById(id);
            return  true;
        }
        return false;
    }

    @Override
    public City update(City entity, long id) {
        var existingCity = getById(id);
        if(existingCity!=null){
            existingCity.setName(entity.getName());
            return  repository.save(entity);
        }
        return null;
    }
}
