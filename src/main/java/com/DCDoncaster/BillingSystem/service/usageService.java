package com.DCDoncaster.BillingSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DCDoncaster.BillingSystem.model.usageModel;
import com.DCDoncaster.BillingSystem.repository.usageRepository;


@Service
public class usageService {

    @Autowired
    usageRepository usagerepository;
    public usageModel createUsageModel(usageModel info){return usagerepository.save(info);}


}
