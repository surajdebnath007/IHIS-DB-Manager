package com.ihis.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "CITIZEN_APPLICATION")
@Data
public class CitizenApplicationEntity {

	@Id
	@GeneratedValue
	@Column(name = "case_num")
	private int caseNo;

	@Column(name = "full_name")
	private String fullName;

	@Column(name = "email_id")
	private String emailId;

	@Column(name = "password")
	private String password;

	@Column(name = "dob")
	private LocalDate dob;

	@Column(name = "mobile_no")
	private long mobileNo;

	@Column(name = "gender")
	private String gender;

	@Column(name = "ssn")
	private long ssn;

	@Column(name = "state")
	private String state;

	@Column(name = "active_switch")
	private char activeSwitch;

	@Column(name = "created_date")
	private LocalDate createdDate;

	@Column(name = "updated_date")
	private LocalDate updatedDate;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "updated_by")
	private String updatedBy;
}
