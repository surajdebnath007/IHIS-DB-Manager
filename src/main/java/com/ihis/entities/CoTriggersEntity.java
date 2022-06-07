package com.ihis.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "CO_TRIGGERS")
@Data
public class CoTriggersEntity {

	@Id
	@GeneratedValue
	@Column(name = "TRG_ID")
	private int trgId;

	@Column(name = "CASE_NO")
	private int caseNo;

	@Column(name = "TRG_STATUS")
	private char trgStatus;

	@Column(name = "NOTICE")
	private String notice;
}
