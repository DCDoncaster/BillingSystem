package com.DCDoncaster.BillingSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DCDoncaster.BillingSystem.model.usageModel;
import com.DCDoncaster.BillingSystem.repository.usageRepository;

import java.util.Optional;
import java.util.List;


@Service
public class usageService {

    @Autowired
    usageRepository usagerepository;
    public usageModel createUsageModel(usageModel info){return usagerepository.save(info);}

    public Optional<usageModel> getUsageofUser(String accountnumber){
        return usagerepository.findByaccountnumber(accountnumber);}

    public List<usageModel> getAllReadings(String accountnumber){
        return usagerepository.findAllByaccountnumber(accountnumber);}



    public List<usageModel> getReadingsByDate(String date){
        return usagerepository.findAllByDate(date);}
}
