package com.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.request.CalculatorRequest;
import com.example.response.CalculatorResponse;
import com.example.service.DemoCalculatorService;

import lombok.extern.slf4j.Slf4j;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@ComponentScan(basePackages = "com.example")
//@EnableSwagger2
@Slf4j
@RequestMapping("/calculator/v1")
@RestController
public class DemoCalculatorController {
	
	//Logger log;
	 
	/** The Constant LOG. */
	private static final Logger LOG = LoggerFactory.getLogger(DemoCalculatorController.class);
	
	@Autowired
	DemoCalculatorService demoCalculatorService;
	
	/**
	 * @param number1
	 * @param number2
	 * @return
	 */
	@RequestMapping("/addition")
	@ResponseBody
	public CalculatorResponse addition(@RequestParam double number1 ,@RequestParam double number2) {
		LOG.info("DemoCalculatorController.addition() starts");
		CalculatorRequest calculatorRequest = new CalculatorRequest();
		calculatorRequest.setNumberOne(number1);
		calculatorRequest.setNumberTwo(number2);
		LOG.info("DemoCalculatorController.addition() request :");
	    
	    CalculatorResponse calculatorResponse= demoCalculatorService.getAdditionOfTwoNumbers(calculatorRequest);
	    
	    LOG.info("DemoCalculatorController.addition() request :");
		return calculatorResponse;
	}
	
	/**
	 * @param number1
	 * @param number2
	 * @return
	 */
	@RequestMapping("/subtraction")
	@ResponseBody
	public CalculatorResponse subtraction(@RequestParam double number1 ,@RequestParam double number2) {
		LOG.info("DemoCalculatorController.subtraction() starts");
		CalculatorRequest calculatorRequest = new CalculatorRequest();
		calculatorRequest.setNumberOne(number1);
		calculatorRequest.setNumberTwo(number2);
	    LOG.info("DemoCalculatorController.subtraction() request :");
	    
	    CalculatorResponse calculatorResponse = demoCalculatorService.getSubtractionOfTwoNumbers(calculatorRequest);
	    
		LOG.info("DemoCalculatorController.subtraction() response :");
		return calculatorResponse;
	}
	
	/**
	 * @param number1
	 * @param number2
	 * @return
	 */
	@RequestMapping("/multiplication")
	@ResponseBody
	public CalculatorResponse multiplication(@RequestParam double number1 ,@RequestParam double number2) {
		LOG.info("DemoCalculatorController.multiplication() starts");
	    CalculatorRequest calculatorRequest = new CalculatorRequest();
		calculatorRequest.setNumberOne(number1);
		calculatorRequest.setNumberTwo(number2);
		LOG.info("DemoCalculatorController.multiplication() request :",calculatorRequest);
		CalculatorResponse calculatorResponse = demoCalculatorService.getMultiplicationOfTwoNumbers(calculatorRequest);
		LOG.info("DemoCalculatorController.multiplication() response :",calculatorResponse);
		return calculatorResponse;
	}
	
	/**
	 * @param number1
	 * @param number2
	 * @return
	 */
	@RequestMapping("/division")
	@ResponseBody
	public CalculatorResponse division(@RequestParam double number1 ,@RequestParam double number2) {
		LOG.info("DemoCalculatorController.division() starts");
		CalculatorRequest calculatorRequest = new CalculatorRequest();
		calculatorRequest.setNumberOne(number1);
		calculatorRequest.setNumberTwo(number2);
	    LOG.info("DemoCalculatorController.division() request :");
	    CalculatorResponse calculatorResponse = demoCalculatorService.getDivisionOfTwoNumbers(calculatorRequest);
		LOG.info("DemoCalculatorController.division() response :",calculatorResponse);
		return calculatorResponse;
	}
}
