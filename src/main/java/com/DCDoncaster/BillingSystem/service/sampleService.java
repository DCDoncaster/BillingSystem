package com.DCDoncaster.BillingSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DCDoncaster.BillingSystem.model.sampleModel;

import com.DCDoncaster.BillingSystem.repository.sampleRepository;

import java.util.List;
import java.util.Optional;
import java.util.Objects;

@Service
public class sampleService {
    public static double unitRate = 0.2855;
    @Autowired
    sampleRepository samplerepository;

    //create user
    public sampleModel createsampleModel(sampleModel info){return samplerepository.save(info);    }


    public List<sampleModel> getsampleModel(){return samplerepository.findAll();}

    public Optional<sampleModel> getsampleModelSingle(long id){return samplerepository.findById(id);}

    public sampleModel updateSampleModel(Long id, sampleModel dataupdate){
        //use this to extract a particular value
        sampleModel existingdata = samplerepository.findById(id).get();
        if(!Objects.isNull(dataupdate.getEmail())) {existingdata.setEmail(dataupdate.getEmail());};
        if(!Objects.isNull(dataupdate.getPassword())) {existingdata.setPassword(dataupdate.getPassword());};
        if(!Objects.isNull(dataupdate.getFullname())) {existingdata.setFullname(dataupdate.getFullname());};
        if(!Objects.isNull(dataupdate.getOutstandingbalance())) {existingdata.setOutstandingbalance(dataupdate.getOutstandingbalance());};
        if(!Objects.isNull(dataupdate.getLastreading())) {
            //update outstanding balance
            double newCharge = (unitRate * (dataupdate.getLastreading() - existingdata.getLastreading()));
            System.out.println(newCharge);
            existingdata.setOutstandingbalance(existingdata.getOutstandingbalance()+newCharge);
            existingdata.setLastreading(dataupdate.getLastreading());
        };
        return samplerepository.save(existingdata);
}
//Delete Account but only if the outstanding balance is set at 0 - if below 0 shoudl trigger a method to issue a refund for the customer.
    public void deleteUser(Long id){
        sampleModel useraccount = samplerepository.findById(id).get();
        if(useraccount.getOutstandingbalance() == 0){
        samplerepository.deleteById(id);}



    }




   }


