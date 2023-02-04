package com.anishit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "INCOME_DETAILS")
@Data
public class Income {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer incomeId;
	private Double monthlyIncome;
	private Double annualIncome;
	private Double rent;
	private Long caseNo;
}
