package com.DCDoncaster.BillingSystem.repository;

import com.DCDoncaster.BillingSystem.model.usageModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DCDoncaster.BillingSystem.model.sampleModel;

import java.util.List;
import java.util.Optional;


@Repository
public interface sampleRepository extends JpaRepository<sampleModel, Long> {
    
    Optional<sampleModel> findByEmail(String email);

}




