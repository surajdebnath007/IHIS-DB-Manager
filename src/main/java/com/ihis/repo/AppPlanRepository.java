package com.ihis.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ihis.entities.AppPlanEntity;

public interface AppPlanRepository extends JpaRepository<AppPlanEntity, Integer> {

}
