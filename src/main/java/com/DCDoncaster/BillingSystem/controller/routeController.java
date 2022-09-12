package com.DCDoncaster.BillingSystem.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.DCDoncaster.BillingSystem.model.sampleModel;
import com.DCDoncaster.BillingSystem.model.usageModel;
import com.DCDoncaster.BillingSystem.service.sampleService;
import com.DCDoncaster.BillingSystem.service.usageService;


@RestController
@RequestMapping("/api")
public class routeController {

    @Autowired
    sampleService sampleservice;

    @Autowired
    usageService usageservice;

    @RequestMapping(value="/submit", method=RequestMethod.POST)
    public usageModel createUsageModel(@RequestBody usageModel data) {
    return usageservice.createUsageModel(data);
    }

    @RequestMapping(value="/create", method=RequestMethod.POST)
    public sampleModel createSampleModel(@RequestBody sampleModel data) {return sampleservice.createsampleModel(data);
    }

    @RequestMapping(value="/read", method=RequestMethod.GET)
    public List<sampleModel> readSampleModel(){
        return sampleservice.getsampleModel();
    }

    @RequestMapping(value="/read/{id}", method=RequestMethod.GET)
    public Optional<sampleModel> readSampleModelSingle(@PathVariable(value = "id") Long id){
       return sampleservice.getsampleModelSingle(id);
    }

    @RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
    public sampleModel updateSampleModel(@PathVariable(value = "id") Long id, @RequestBody sampleModel dataupdate){
        return sampleservice.updateSampleModel(id, dataupdate);
    }

    @RequestMapping(value="/delete/{id}", method=RequestMethod.DELETE)
    public void deleteCharacter(@PathVariable(value = "id") Long id){
        sampleservice.deleteCharacter(id);
    }

}
