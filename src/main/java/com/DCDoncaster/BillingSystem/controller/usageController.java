package com.DCDoncaster.BillingSystem.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.DCDoncaster.BillingSystem.model.usageModel;

import com.DCDoncaster.BillingSystem.service.usageService;


@RestController
@RequestMapping("/readings")
public class usageController {

    @Autowired
    usageService usageservice;

    @RequestMapping(value="/submit", method=RequestMethod.POST)
    public usageModel createUsageModel(@RequestBody usageModel data) {
        return usageservice.createUsageModel(data);
    }


}
