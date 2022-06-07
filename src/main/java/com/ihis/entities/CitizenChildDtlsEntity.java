package com.ihis.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "CITIZEN_CHILD_DTLS")
@Data
public class CitizenChildDtlsEntity {

	@Id
	@GeneratedValue
	@Column(name = "kids_id")
	private int kidsId;

	@Column(name = "kids_name")
	private String kidsName;

	@Column(name = "kids_dob")
	private LocalDate kidsDob;

	@Column(name = "kids_ssn")
	private long kidsSSN;

	@Column(name = "created_date")
	private LocalDate createdDate;

	@Column(name = "updated_date")
	private LocalDate updatedDate;

	@Column(name = "created_by")
	private String createdBy;

	@Column(name = "updated_by")
	private String updatedBy;
}
