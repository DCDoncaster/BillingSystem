package com.DCDoncaster.BillingSystem.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DCDoncaster.BillingSystem.model.sampleModel;

import com.DCDoncaster.BillingSystem.repository.sampleRepository;

import java.util.List;
import java.util.Optional;
import java.util.Objects;
import java.net.URI;
import java.math.BigDecimal;

import com.twilio.Twilio;
import com.twilio.converter.Promoter;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;


@Service
public class sampleService {
    public static final String ACCOUNT_SID = "ACc9c84b76cf25af228f8dc7dfd7660046";
    public static final String AUTH_TOKEN = " 2bb3f3f50efd379c94b0fe468bf2e0fc";
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
        if(!Objects.isNull(dataupdate.getLastreading())) {
            //update outstanding balance
            double newCharge = (unitRate * (dataupdate.getLastreading() - existingdata.getLastreading()));
            double existingBalance = existingdata.getOutstandingbalance();
            existingdata.setOutstandingbalance(newCharge + existingBalance);
            existingdata.setLastreading(dataupdate.getLastreading());
        };




            Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
            Message message = Message.creator(
                            new com.twilio.type.PhoneNumber("+447784897307"), //this could be set to the phone number of the customer in the database to be more dynamic
                            "MGb8c8a0f88021746132fa467d2a859247",
                            "Your new balance on your account is £" + existingdata.getOutstandingbalance())
                    .create();
            System.out.println("Banana Pancakes");
            System.out.println(message.getSid());



        return samplerepository.save(existingdata);
}
//Delete Account but only if the outstanding balance is set at 0 - if below 0 shoudl trigger a method to issue a refund for the customer.
    public void deleteUser(Long id, sampleModel deleteData){
        sampleModel useraccount = samplerepository.findById(id).get();
        if(useraccount.getOutstandingbalance() <= 5){
            System.out.println(useraccount.getEmail());
            System.out.println(deleteData.getEmail());
            if (useraccount.getEmail().equals(deleteData.getEmail())){

        samplerepository.deleteById(id);}}
    }




   }


