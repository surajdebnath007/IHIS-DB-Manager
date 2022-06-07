package com.ihis.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "ELIGIBILITY_DETAILS")
@Data
public class EligibilityDetailsEntity {

	@Id
	@GeneratedValue
	@Column(name = "eligibility_id")
	private int eligibilityId;

	@Column(name = "case_no")
	private int caseNo;

	@Column(name = "plan_id")
	private int planId;

	@Column(name = "plan_status")
	private String planStatus;

	@Column(name = "start_date")
	private LocalDate startDate;

	@Column(name = "end_date")
	private LocalDate endDate;

	@Column(name = "benefit_amount")
	private int benefitAmount;

	@Column(name = "denial_reason")
	private String denialReason;

	@Column(name = "created_date")
	private LocalDate createdDate;

	@Column(name = "updated_date")
	private LocalDate updatedDate;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "updated_by")
	private String updatedBy;
}
