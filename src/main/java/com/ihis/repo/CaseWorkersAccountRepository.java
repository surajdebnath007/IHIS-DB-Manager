package com.ihis.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ihis.entities.CaseWorkersAccountEntity;

public interface CaseWorkersAccountRepository extends JpaRepository<CaseWorkersAccountEntity, Integer> {

	public CaseWorkersAccountEntity findByEmailIdAndPassword(String emailId, String password);

	public CaseWorkersAccountEntity findByEmailId(String emailId);
}
