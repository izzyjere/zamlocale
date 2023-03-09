package com.guavasoft.zamlocale.data;

import com.guavasoft.zamlocale.models.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City,Long> {
}
