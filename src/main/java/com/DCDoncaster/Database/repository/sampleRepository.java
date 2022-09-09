package com.DCDoncaster.Database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.DCDoncaster.Database.model.sampleModel;

@Repository
public interface sampleRepository extends JpaRepository<sampleModel, Long> {
}
