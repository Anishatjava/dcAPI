package com.anishit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anishit.entity.Plan;

public interface PlanRepo extends JpaRepository<Plan, Integer>{

}
