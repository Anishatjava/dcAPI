package com.anishit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anishit.entity.Income;

public interface IncomeRepo extends JpaRepository<Income, Integer>{

}
