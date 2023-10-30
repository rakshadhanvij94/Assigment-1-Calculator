package com.example.calci;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan(basePackages = "com.example")
@RestController
public class DemoCalculatorController {
	
	@Autowired
	DemoCalculatorService demoCalculatorService;

	/**
	 * @param number1
	 * @param number2
	 * @return
	 */
	@RequestMapping("/addition")
	@ResponseBody
	public Map<String,Object> addition(@RequestParam double number1 ,@RequestParam double number2) {
		return demoCalculatorService.getAdditionOfTwoNumbers(number1, number2);
	}
	
	/**
	 * @param number1
	 * @param number2
	 * @return
	 */
	@RequestMapping("/subtraction")
	@ResponseBody
	public Map<String,Object> subtraction(@RequestParam double number1 ,@RequestParam double number2) {
		return demoCalculatorService.getSubtractionOfTwoNumbers(number1, number2);
	}
	
	/**
	 * @param number1
	 * @param number2
	 * @return
	 */
	@RequestMapping("/multiplication")
	@ResponseBody
	public Map<String,Object> multiplication(@RequestParam double number1 ,@RequestParam double number2) {
		return demoCalculatorService.getMultiplicationOfTwoNumbers(number1, number2);
	}
	
	/**
	 * @param number1
	 * @param number2
	 * @return
	 */
	@RequestMapping("/division")
	@ResponseBody
	public Map<String,Object> division(@RequestParam double number1 ,@RequestParam double number2) {
		return demoCalculatorService.getDivisionOfTwoNumbers(number1, number2);
	}
}
