package com.DCDoncaster.Database.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.DCDoncaster.Database.model.sampleModel;
import com.DCDoncaster.Database.service.sampleService;


@RestController
@RequestMapping("/api")
public class sampleController {

    @Autowired
    sampleService sampleservice;

    @RequestMapping(value="/", method=RequestMethod.POST)
    public sampleModel createsampleModel(@RequestBody sampleModel data) {
        return sampleservice.createsampleModel(data);
    }

    @RequestMapping(value="/", method=RequestMethod.GET)
    public List<sampleModel> readsampleModel(){
        return sampleservice.readsampleModel();
    }
}
