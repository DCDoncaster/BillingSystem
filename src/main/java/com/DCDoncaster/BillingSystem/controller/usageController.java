package com.DCDoncaster.BillingSystem.controller;



import com.DCDoncaster.BillingSystem.model.sampleModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.DCDoncaster.BillingSystem.model.usageModel;

import com.DCDoncaster.BillingSystem.service.usageService;

import java.util.Optional;



@RestController
@RequestMapping("/readings")
public class usageController {

    @Autowired
    usageService usageservice;

    @RequestMapping(value="/submit", method=RequestMethod.POST)
    public usageModel createUsageModel(@RequestBody usageModel data) {
        return usageservice.createUsageModel(data);
    }

    @RequestMapping(value="/checkusage/{id}", method=RequestMethod.GET)
    public Optional<usageModel> getUsageofUser(@PathVariable(value = "id") Long id){
        return usageservice.getUsageofUser(id);
    }
}
