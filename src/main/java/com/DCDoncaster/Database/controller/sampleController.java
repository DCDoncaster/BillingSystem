package com.DCDoncaster.Database.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.DCDoncaster.Database.model.sampleModel;
import com.DCDoncaster.Database.service.sampleService;


@RestController
@RequestMapping("/api")
public class sampleController {

    @Autowired
    sampleService sampleservice;

    @RequestMapping(value="/create", method=RequestMethod.POST)
    public sampleModel createsampleModel(@RequestBody sampleModel data) {
        return sampleservice.createsampleModel(data);
    }
}
