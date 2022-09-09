package com.DCDoncaster.Database.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DCDoncaster.Database.model.sampleModel;
import com.DCDoncaster.Database.repository.sampleRepository;


@Service
public class sampleService {

    @Autowired
    sampleRepository samplerepository;

    public sampleModel createsampleModel(sampleModel info){
        return samplerepository.save(info);
    }

}