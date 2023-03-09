package com.guavasoft.zamlocale.controllers;

import com.guavasoft.zamlocale.contracts.Result;
import com.guavasoft.zamlocale.models.Province;
import com.guavasoft.zamlocale.services.IProvinceService;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/province")
public class ProvinceController {
    private IProvinceService service;
    public ProvinceController(IProvinceService service) {
        this.service = service;
    }
    @PostMapping
    public ResponseEntity<Province> Create(@RequestBody Province province){
      var created = service.create(province);
      if(created!=null){
          return  new ResponseEntity<>(created, HttpStatusCode.valueOf(200));
      }
      return  new ResponseEntity<>(null,HttpStatusCode.valueOf(500));
    }
}
