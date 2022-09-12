package com.DCDoncaster.BillingSystem.repository;

import com.DCDoncaster.BillingSystem.model.usageModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface usageRepository extends JpaRepository<usageModel, Long> {
}
