package com.guavasoft.zamlocale.services.imp;

import com.guavasoft.zamlocale.data.IRepository;
import com.guavasoft.zamlocale.models.Province;
import com.guavasoft.zamlocale.services.IProvinceService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProvinceService implements IProvinceService {
    private IRepository<Province> repository;

    public ProvinceService(IRepository<Province> repository) {
        this.repository = repository;
    }

    @Override
    public Province getById(long id) {
        return null;
    }

    @Override
    public List<Province> getAll() {
        return repository.findAll();
    }

    @Override
    public Province create(Province entity) {
        return  repository.save(entity);
    }

    @Override
    public boolean deleteById(long id) {
        return false;
    }

    @Override
    public Province update(Province entity, long id){
        return  null;
    }
}
