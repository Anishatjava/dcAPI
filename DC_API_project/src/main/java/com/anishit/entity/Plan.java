package com.anishit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "PLAN_NAME")
@Data
public class Plan {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer planId;
	private String planName;
}
