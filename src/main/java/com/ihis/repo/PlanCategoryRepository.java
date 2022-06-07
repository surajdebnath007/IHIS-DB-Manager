package com.ihis.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ihis.entities.PlanCategoryEntity;

public interface PlanCategoryRepository extends JpaRepository<PlanCategoryEntity, Integer> {

}
