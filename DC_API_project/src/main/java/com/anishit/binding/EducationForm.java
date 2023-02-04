package com.anishit.binding;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class EducationForm {

	private Long caseNo;
	private String eduQualification;
	private LocalDateTime edupassingYear;
	private String eduUniv;

}
