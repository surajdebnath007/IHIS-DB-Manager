package com.ihis.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "PLAN_CATEGORY_MASTER")
@Data
public class PlanCategoryEntity{

	@Id
	@GeneratedValue
	@Column(name = "category_id")
	private int categoryId;

	@Column(name = "category_name")
	private String categoryName;
}
