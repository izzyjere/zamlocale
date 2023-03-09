package com.guavasoft.zamlocale.services.imp;

import com.guavasoft.zamlocale.data.ProvinceRepository;
import com.guavasoft.zamlocale.models.Province;
import com.guavasoft.zamlocale.services.IProvinceService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProvinceService implements IProvinceService {
    private ProvinceRepository repository;

    public ProvinceService(ProvinceRepository repository) {
        this.repository = repository;
    }

    @Override
    public Province getById(long id) {
        var record = repository.findById(id);
        if(record.isPresent())
            return record.get();
        return  null;
    }

    @Override
    public List<Province> getAll() {
        return repository.findAll();
    }

    @Override
    public Province create(Province entity) {
        return repository.save(entity);
    }

    @Override
    public boolean deleteById(long id) {
        if(getById(id)!=null){
            repository.deleteById(id);
            return true;
        }
        return  false;
    }

    @Override
    public Province update(Province entity, long id){
        var existingRecord = getById(id);
        if(existingRecord!=null){
            existingRecord.setName(entity.getName());
            return  repository.save(existingRecord);
        }
        return null;
    }
}
