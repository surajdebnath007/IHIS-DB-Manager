package com.ihis.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "CITIZEN_GRADUATION_DTLS")
@Data
public class CitizenGraduationDtlsEntity {

	@Id
	@GeneratedValue
	@Column(name = "education_id")
	private int educationId;

	@Column(name = "highest_degree")
	private String highestDegree;

	@Column(name = "case_no")
	private int caseNo;

	@Column(name = "graduation_id")
	private int graduationId;

	@Column(name = "university")
	private String university;

	@Column(name = "created_date")
	private LocalDate createdDate;

	@Column(name = "updated_date")
	private LocalDate updatedDate;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "updated_by")
	private String updatedBy;
}
