package com.ihis.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "CITIZEN_PLANS")
@Data
public class CitizenPlansEntity {

	@Id
	@GeneratedValue
	@Column(name = "citizen_id")
	private int citizenId;

	@Column(name = "case_no")
	private int caseNo;

	@Column(name = "plan_id")
	private int planId;

	@Column(name = "created_date")
	private LocalDate createdDate;

	@Column(name = "updated_date")
	private LocalDate updatedDate;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "updated_by")
	private String updatedBy;

}
