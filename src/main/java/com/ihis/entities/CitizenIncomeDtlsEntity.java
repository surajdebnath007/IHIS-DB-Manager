package com.ihis.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "CITIZEN_INCOME_DTLS")
@Data
public class CitizenIncomeDtlsEntity {

	@Id
	@GeneratedValue
	@Column(name = "income_id")
	private int incomeId;

	@Column(name = "case_no")
	private int caseNo;

	@Column(name = "monthly_income")
	private int monthlyIncome;

	@Column(name = "rent_income")
	private int rentIncome;

	@Column(name = "property_income")
	private int propertyIncome;

	@Column(name = "created_date")
	private LocalDate createdDate;

	@Column(name = "updated_date")
	private LocalDate updatedDate;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "updated_by")
	private String updatedBy;
}
