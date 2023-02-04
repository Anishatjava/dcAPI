package com.anishit.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "KIDS_DETAILS")
@Data
public class Kids {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer kidId;
	private Long caseNo;
	private String kidName;
	private Integer kidAge;
	private Long kidSSN;

}
