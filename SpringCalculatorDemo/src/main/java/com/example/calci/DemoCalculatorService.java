package com.example.calci;

import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class DemoCalculatorService {
	
	/**
	 * @param number1
	 * @param number2
	 * @return
	 */
	public Map<String,Object> getAdditionOfTwoNumbers(@RequestParam double number1 ,@RequestParam double number2) {
		double result = number1+number2;
		String details = number1+"+"+number2+"="+result;
		Map.of("addition",result,"details",details);
		return Map.of("addition",result,"details",details);
	}
	
	/**
	 * @param number1
	 * @param number2
	 * @return
	 */
	public Map<String,Object> getSubtractionOfTwoNumbers(@RequestParam double number1 ,@RequestParam double number2) {
		double result = number1-number2;
		String details = number1+"-"+number2+"="+result;
		Map.of("addition",result,"details",details);
		return Map.of("addition",result,"details",details);
	}
	
	/**
	 * @param number1
	 * @param number2
	 * @return
	 */
	public Map<String,Object> getMultiplicationOfTwoNumbers(@RequestParam double number1 ,@RequestParam double number2) {
		double result = number1*number2;
		String details = number1+"*"+number2+"="+result;
		Map.of("addition",result,"details",details);
		return Map.of("addition",result,"details",details);
	}
	
	/**
	 * @param number1
	 * @param number2
	 * @return
	 */
	public Map<String,Object> getDivisionOfTwoNumbers(@RequestParam double number1 ,@RequestParam double number2) {
		double result = number1/number2;
		String details = number1+"/"+number2+"="+result;
		Map.of("addition",result,"details",details);
		return Map.of("addition",result,"details",details);
	}
	
}
