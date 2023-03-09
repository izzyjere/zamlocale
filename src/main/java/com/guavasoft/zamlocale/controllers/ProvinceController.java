package com.guavasoft.zamlocale.controllers;

import com.guavasoft.zamlocale.contracts.Result;
import com.guavasoft.zamlocale.models.Province;
import com.guavasoft.zamlocale.services.IProvinceService;
import jakarta.websocket.server.PathParam;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping
    public  ResponseEntity<List<Province>> GetAll (){
       return new ResponseEntity<>(service.getAll(),HttpStatusCode.valueOf(200));
    }
    @GetMapping("getById")
    public  ResponseEntity<Province> GetById(@PathParam("id") long id){
        var record = service.getById(id);
        if(record!=null) {
            return  new ResponseEntity<>(record,HttpStatusCode.valueOf(200));
        }
        return  new ResponseEntity<>(HttpStatusCode.valueOf(401));
    }
    @PutMapping
    public  ResponseEntity<Province> Update(@PathParam("id") long id, Province entity){
        var updated = service.update(entity,id);
        if(updated!=null){
            return  new ResponseEntity<>(updated, HttpStatusCode.valueOf(200));
        }
        return new ResponseEntity<>(HttpStatusCode.valueOf(400));
    }
}
