package com.tu.ac.th.services.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tu.ac.th.services.Models.AddDropForm;
import com.tu.ac.th.services.Repository.AddDropFormRepository;

@RestController
public class addDropFormController {
    @Autowired
    AddDropFormRepository ad;

    @PostMapping("/api/form/saveAddDropForm")
    private int saveAddDropForm(@RequestBody String jsonAddDropString){
        try{
            AddDropForm af = new AddDropForm(jsonAddDropString);
            ad.save(af);
            return 0;
        }catch(Exception e){
            return 1;
        }
    }

}