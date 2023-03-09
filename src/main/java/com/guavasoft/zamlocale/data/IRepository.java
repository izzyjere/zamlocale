package com.guavasoft.zamlocale.data;

import com.guavasoft.zamlocale.models.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepository<TModel> extends JpaRepository<TModel,Long> {

}
