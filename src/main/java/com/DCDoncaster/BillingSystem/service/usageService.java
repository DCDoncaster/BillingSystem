package com.DCDoncaster.BillingSystem.service;
import com.DCDoncaster.BillingSystem.model.usageModel;
import com.DCDoncaster.BillingSystem.repository.usageRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class usageService {

    @Autowired
    usageRepository usagerepository;
    public usageModel createUsageModel(usageModel info){return usagerepository.save(info);}

    public List<usageModel> getAllReadings(String accountnumber){
        return usagerepository.findAllByaccountnumber(accountnumber);}

    public List<usageModel> getReadingsByDate(String date){
        return usagerepository.findAllByDate(date);}
}