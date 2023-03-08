package com.guavasoft.zamlocale.services;

import java.util.List;

public interface IService<TModel>  {
    TModel getById(long id);
    List<TModel> getAll();
    boolean create(TModel entity);
    boolean deleteById(long id);
    boolean update(TModel entity);
}
