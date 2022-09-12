package com.DCDoncaster.BillingSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DCDoncaster.BillingSystem.model.sampleModel;

@Repository
public interface sampleRepository extends JpaRepository<sampleModel, Long> {
}
