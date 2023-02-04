package com.anishit.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anishit.binding.EducationForm;
import com.anishit.binding.IncomeForm;
import com.anishit.binding.KidsForm;
import com.anishit.binding.PlanSelectionForm;
import com.anishit.entity.Plan;
import com.anishit.service.DataCollectionService;

@RestController
public class DataCollectionRestController {

	@Autowired
	private DataCollectionService service;

	@GetMapping("/plans")
	public ResponseEntity<List<Plan>> getPlans() {
		List<Plan> plans = service.getPlans();
		return new ResponseEntity<>(plans, HttpStatus.OK);

	}

	@PostMapping("/createplans")
	public ResponseEntity<String> createPlans(@RequestBody PlanSelectionForm planSelectionForm) {
		String status = service.craetePlan(planSelectionForm);
		return new ResponseEntity<>(status, HttpStatus.CREATED);

	}

	@PostMapping("/createincome")
	public ResponseEntity<String> createIncome(@RequestBody IncomeForm incomeForm) {
		String status = service.createIncome(incomeForm);
		return new ResponseEntity<>(status, HttpStatus.CREATED);

	}

	@PostMapping("/createedu")
	public ResponseEntity<String> createEducation(@RequestBody EducationForm educationForm) {
		String status = service.createEducation(educationForm);
		return new ResponseEntity<>(status, HttpStatus.CREATED);

	}

	@PostMapping("/createkids")
	public ResponseEntity<String> createKids(@RequestBody List<KidsForm> kidsForms) {
		String status = service.createKids(kidsForms);
		return new ResponseEntity<>(status, HttpStatus.CREATED);

	}
}
