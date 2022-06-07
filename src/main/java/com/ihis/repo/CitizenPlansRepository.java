package com.ihis.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ihis.entities.CitizenPlansEntity;

public interface CitizenPlansRepository extends JpaRepository<CitizenPlansEntity, Integer> {

}
