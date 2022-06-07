package com.ihis.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ihis.entities.CitizenApplicationEntity;

public interface CitizenApplicationRepository extends JpaRepository<CitizenApplicationEntity, Integer> {

}
