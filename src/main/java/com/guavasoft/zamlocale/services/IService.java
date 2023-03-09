package com.guavasoft.zamlocale.services;

import java.util.List;

public interface IService<TModel>  {
    TModel getById(long id);
    List<TModel> getAll();
    TModel create(TModel entity);
    boolean deleteById(long id);
    TModel update(TModel entity, long id);
}
