package com.DCDoncaster.BillingSystem.repository;

import com.DCDoncaster.BillingSystem.model.usageModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import java.util.List;

@Repository
public interface usageRepository extends JpaRepository<usageModel, Long> {
    Optional<usageModel> findByaccountnumber(String accountnumber);
    List<usageModel> findAllByaccountnumber(String accountnumber);
    List<usageModel> findAllByDate(String date);
}
