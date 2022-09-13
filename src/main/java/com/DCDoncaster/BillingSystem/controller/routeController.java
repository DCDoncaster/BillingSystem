package com.DCDoncaster.BillingSystem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.DCDoncaster.BillingSystem.model.sampleModel;
import com.DCDoncaster.BillingSystem.service.sampleService;



@RestController
@RequestMapping("/api")
public class routeController {

    @Autowired
    sampleService sampleservice;

//    Creates New User
    @RequestMapping(value="/create", method=RequestMethod.POST)
    public sampleModel createSampleModel(@RequestBody sampleModel data) {return sampleservice.createsampleModel(data);
    }

    //gets all users data regardless of any syntax
    @RequestMapping(value="/read", method=RequestMethod.GET)
    public List<sampleModel> readSampleModel(){return sampleservice.getsampleModel();   }

    //gets an individual user based on their unique key ID
    @RequestMapping(value="/read/{id}", method=RequestMethod.GET)
    public Optional<sampleModel> readSampleModelSingle(@PathVariable(value = "id") Long id){
       return sampleservice.getsampleModelSingle(id);
    }

//    @RequestMapping(value="/os/{id}", method=RequestMethod.GET)
    //build object here to return last reading and o/s based on account ID

    //Updates all details on a user based on the given ID
    @RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
    public sampleModel updateSampleModel(@PathVariable(value = "id") Long id, @RequestBody sampleModel dataupdate){
        return sampleservice.updateSampleModel(id, dataupdate);
    }

    //Deletes a user
    @RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
    public void deleteUser(@PathVariable(value = "id") Long id){
        sampleservice.deleteUser(id);
    }



}
