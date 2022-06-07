package com.ihis.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Entity
@Table(name = "CASE_WORKERS_ACCOUNT")
@Data
public class CaseWorkersAccountEntity {

	@Id
	@GeneratedValue
	@Column(name = "account_id")
	private int accountId;

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

	@Column(name = "active_switch")
	private char activeSwitch;

	@CreationTimestamp
	@Column(name = "created_date", updatable = false)
	private LocalDate createdDate;

	@UpdateTimestamp
	@Column(name = "updated_date", updatable = false)
	private LocalDate updatedDate;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "updated_by")
	private String updatedBy;
}
