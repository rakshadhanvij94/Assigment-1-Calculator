package com.example.dao;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.constants.Constants;
import com.example.controller.DemoCalculatorController;
import com.example.jpa.CalculatorDataEntity;
import com.example.response.CalculatorResponse;
import com.example.transformer.CalculatorTransformer;
import com.example.util.Utils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class CalculatorDemoDaoImpl {

	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(CalculatorDemoDaoImpl.class);
	
	@Autowired
	CalculatorRepository calculatorRepository;
	
	@Autowired
	CalculatorTransformer calculatorTransformer;
	
	/**
	 * @param calculatorDataEntity
	 * @return
	 */
	public CalculatorResponse saveCalculatorData(CalculatorDataEntity calculatorDataEntity)
	{
		long startTime=System.currentTimeMillis();
		CalculatorDataEntity response =null;
		CalculatorResponse transformToObject=null;
		LOG.info("CalculatorDemoDaoImpl.saveCalculatorData() start");
		LOG.info(Constants.TIME_ELAPSED,startTime);
		try{
			calculatorDataEntity.setTimeStamp(LocalDateTime.now());
			response = calculatorRepository.save(calculatorDataEntity);
			if(!Utils.isEmptyOrNULL(response))
			{
				transformToObject = calculatorTransformer.transformToDomain(response);
			}
		}
		catch (Exception e) {
			LOG.error(e.getMessage());
		}
		LOG.info("CalculatorDemoDaoImpl.saveData() end");
		LOG.info(Constants.TIME_ELAPSED,startTime-System.currentTimeMillis());
		return transformToObject;		
	}
}
