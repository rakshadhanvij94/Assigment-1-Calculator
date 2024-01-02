package com.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.constants.Constants;
import com.example.controller.DemoCalculatorController;
import com.example.dao.CalculatorDemoDaoImpl;
import com.example.jpa.CalculatorDataEntity;
import com.example.request.CalculatorRequest;
import com.example.response.CalculatorResponse;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DemoCalculatorService {

	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(DemoCalculatorController.class);

	@Autowired
	public CalculatorDemoDaoImpl calculatorDemoDaoImpl;

	/**
	 * @param calculatorRequest
	 * @return
	 */
	@Cacheable(value = "calculatorCache", key = "'addition:' + #calculatorRequest.numberOne + ':' + #calculatorRequest.numberTwo", unless = "#result == null")
	public CalculatorResponse getAdditionOfTwoNumbers(@RequestParam CalculatorRequest calculatorRequest) {
		CalculatorResponse calculatorResponse;

		long startTime = System.currentTimeMillis();
		LOG.info("CalculatorServiceImpl.getAddition() start ");
		LOG.info(Constants.TIME_ELAPSED, startTime);
		double result = calculatorRequest.getNumberOne() + calculatorRequest.getNumberTwo();

		CalculatorDataEntity calculatorDataEntity = prepareRequest(calculatorRequest, Constants.ADDITION, result);
		calculatorResponse = calculatorDemoDaoImpl.saveCalculatorData(calculatorDataEntity);

		return calculatorResponse;
	}

	/**
	 * @param number1
	 * @param number2
	 * @return
	 */
	@Cacheable(value = "calculatorCache", key = "'substraction:' + #calculatorRequest.numberOne + ':' + #calculatorRequest.numberTwo", unless = "#result == null")
	public CalculatorResponse getSubtractionOfTwoNumbers(@RequestParam CalculatorRequest calculatorRequest) {
		CalculatorResponse calculatorResponse;
		double result = calculatorRequest.getNumberOne() - calculatorRequest.getNumberTwo();

		CalculatorDataEntity calculatorDataEntity = prepareRequest(calculatorRequest, Constants.SUBSTRACTION, result);
		calculatorResponse = calculatorDemoDaoImpl.saveCalculatorData(calculatorDataEntity);

		return calculatorResponse;
	}

	/**
	 * @param number1
	 * @param number2
	 * @return
	 */
	@Cacheable(value = "calculatorCache", key = "'multiplication:' + #calculatorRequest.numberOne + ':' + #calculatorRequest.numberTwo", unless = "#result == null")
	public CalculatorResponse getMultiplicationOfTwoNumbers(@RequestParam CalculatorRequest calculatorRequest) {
		CalculatorResponse calculatorResponse;
		double result = calculatorRequest.getNumberOne() * calculatorRequest.getNumberTwo();

		CalculatorDataEntity calculatorDataEntity = prepareRequest(calculatorRequest, Constants.MULTIPLICATION, result);
		calculatorResponse = calculatorDemoDaoImpl.saveCalculatorData(calculatorDataEntity);

		return calculatorResponse;
	}

	/**
	 * @param number1
	 * @param number2
	 * @return
	 */
	@Cacheable(value = "calculatorCache", key = "'division:' + #calculatorRequest.numberOne + ':' + #calculatorRequest.numberTwo", unless = "#result == null")
	public CalculatorResponse getDivisionOfTwoNumbers(@RequestParam CalculatorRequest calculatorRequest) {
		CalculatorResponse calculatorResponse;
		double result = calculatorRequest.getNumberOne() / calculatorRequest.getNumberTwo();
		CalculatorDataEntity calculatorDataEntity = prepareRequest(calculatorRequest, Constants.DIVISION, result);
		calculatorResponse = calculatorDemoDaoImpl.saveCalculatorData(calculatorDataEntity);

		return calculatorResponse;
	}

	/**
	 * @param calculatorRequest
	 * @param operation
	 * @param result
	 * @return
	 */
	public CalculatorDataEntity prepareRequest(CalculatorRequest calculatorRequest, String operation, double result) {
		CalculatorDataEntity calculatorData = new CalculatorDataEntity();
		calculatorData.setNumberOne(calculatorRequest.getNumberOne());
		calculatorData.setNumberTwo(calculatorRequest.getNumberTwo());
		calculatorData.setOperation(operation);
		calculatorData.setResult(result);
		return calculatorData;
	}

}
