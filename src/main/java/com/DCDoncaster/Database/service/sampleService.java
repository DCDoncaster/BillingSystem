package com.DCDoncaster.Database.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DCDoncaster.Database.model.sampleModel;
import com.DCDoncaster.Database.repository.sampleRepository;

import java.util.List;
import java.util.Optional;

@Service
public class sampleService {

    @Autowired
    sampleRepository samplerepository;

    public sampleModel createsampleModel(sampleModel info){
        return samplerepository.save(info);
    }
    public List<sampleModel> getsampleModel(){return samplerepository.findAll();}

    public Optional<sampleModel> getsampleModelSingle(long id){return samplerepository.findById(id);}

    public sampleModel updateSampleModel(Long id, sampleModel dataupdate){
        sampleModel existingdata = samplerepository.findById(id).get();
        existingdata.setCharactername(dataupdate.getCharactername());
        existingdata.setCharactertype(dataupdate.getCharactertype());
        return samplerepository.save(existingdata);
}

    public void deleteCharacter(Long id){samplerepository.deleteById(id);}




   }


