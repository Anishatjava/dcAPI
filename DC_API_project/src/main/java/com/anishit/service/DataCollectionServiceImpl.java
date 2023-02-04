package com.anishit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.anishit.binding.EducationForm;
import com.anishit.binding.IncomeForm;
import com.anishit.binding.KidsForm;
import com.anishit.binding.PlanSelectionForm;
import com.anishit.entity.Education;
import com.anishit.entity.Income;
import com.anishit.entity.Kids;
import com.anishit.entity.Plan;
import com.anishit.entity.PlanSelection;
import com.anishit.repo.EducationRepo;
import com.anishit.repo.IncomeRepo;
import com.anishit.repo.KidsRepo;
import com.anishit.repo.PlanRepo;
import com.anishit.repo.PlanSelectionRepo;

@Service
public class DataCollectionServiceImpl implements DataCollectionService {

	@Autowired
	private WebClient webClient;
	@Autowired
	private PlanRepo planRepo;
	@Autowired
	private PlanSelectionRepo psRepo;

	@Autowired
	private IncomeRepo incomeRepo;

	@Autowired
	private EducationRepo educationRepo;

	@Autowired
	private KidsRepo kidsRepo;

	@Override
	public String createCase(Long appId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Plan> getPlans() {
		List<Plan> plans = planRepo.findAll();
		return plans;
	}

	@Override
	public String craetePlan(PlanSelectionForm planSelectionForm) {

		PlanSelection planSelection = new PlanSelection();
		BeanUtils.copyProperties(planSelectionForm, planSelection);
		PlanSelection save = psRepo.save(planSelection);
		if (save != null) {
			return "plan is craeted";
		}
		return "plan is not craeted";

	}

	@Override
	public String createIncome(IncomeForm incomeForm) {
		Income income = new Income();
		BeanUtils.copyProperties(incomeForm, income);
		Income save = incomeRepo.save(income);
		if (save != null) {
			return "Incomne Data saved successfully";
		}
		return "Incomne Data not saved successfully";
	}

	@Override
	public String createEducation(EducationForm educationForm) {
		Education edu = new Education();
		BeanUtils.copyProperties(educationForm, edu);
		Education save = educationRepo.save(edu);
		if (save != null) {
			return "Eduaction Data saved successfully";
		}
		return "Eduaction Data not saved successfully";

	}

	@Override
	public String createKids(List<KidsForm> kidsForms) {
		List<Kids> kids = new ArrayList<>();
		for (KidsForm kid : kidsForms) {
			Kids k = new Kids();
			BeanUtils.copyProperties(kid, k);
			kids.add(k);
		}
		List<Kids> saveAll = kidsRepo.saveAll(kids);
		if (saveAll != null) {
			return "Kids Data saved successfully";
		}
		return "Kids Data not saved successfully";

	}

	@Override
	public Income getIncomeData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Education getIEduData() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Kids> getKidsData() {
		// TODO Auto-generated method stub
		return null;
	}

}
