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
@Table(name = "APP_PLANS")
@Data
public class AppPlanEntity {

	@Id
	@GeneratedValue
	@Column(name = "plan_id")
	private int planId;

	@Column(name = "plan_name")
	private String planName;

	@Column(name = "start_date")
	private LocalDate startDate;

	@Column(name = "end_date")
	private LocalDate endDate;

	@Column(name = "category_id")
	private int categoryId;

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
