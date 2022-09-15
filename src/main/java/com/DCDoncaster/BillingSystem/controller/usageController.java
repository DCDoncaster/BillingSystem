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
import java.util.List;


@RestController
@RequestMapping("/readings")
public class usageController {

    @Autowired
    usageService usageservice;

    //Creates a new reading
    @RequestMapping(value="/submit", method=RequestMethod.POST)
    public usageModel createUsageModel(@RequestBody usageModel data) {
        return usageservice.createUsageModel(data);
    }


//gets all readings based on account number
    @RequestMapping(value="/checkusage/{accountnumber}", method=RequestMethod.GET)
    public List<usageModel> getAllReadings(@PathVariable(value="accountnumber") String accountnumber){
        return usageservice.getAllReadings(accountnumber);
    }

    //gets all readings based on date
    @RequestMapping(value="/checkusage/{date}", method=RequestMethod.GET)
    public List<usageModel> getReadingsByDate(@PathVariable(value="date") String date){
        return usageservice.getReadingsByDate(date);
    }
}
