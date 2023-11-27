package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jpa.CalculatorDataEntity;

public interface CalculatorRepository extends JpaRepository<CalculatorDataEntity,Integer> {

}
