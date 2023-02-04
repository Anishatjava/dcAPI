package com.anishit.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "EDUCATION_DETAILS")
@Data
public class Education {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer eduId;
	private Long caseNo;
	private String eduQualification;
	private LocalDateTime edupassingYear;
	private String eduUniv;

}
