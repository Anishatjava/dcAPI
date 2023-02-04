package com.anishit.service;

import java.util.List;

import com.anishit.binding.EducationForm;
import com.anishit.binding.IncomeForm;
import com.anishit.binding.KidsForm;
import com.anishit.binding.PlanSelectionForm;
import com.anishit.entity.Education;
import com.anishit.entity.Income;
import com.anishit.entity.Kids;
import com.anishit.entity.Plan;

public interface DataCollectionService {

	public String createCase(Long appId);

	public List<Plan> getPlans();

	public String craetePlan(PlanSelectionForm planSelectionForm);

	public String createIncome(IncomeForm incomeForm);

	public String createEducation(EducationForm educationForm);

	public String createKids(List<KidsForm> kidsForm);

	public Income getIncomeData();

	public Education getIEduData();

	public List<Kids> getKidsData();

}
