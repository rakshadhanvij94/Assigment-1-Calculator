package com.example;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.request.CalculatorRequest;
import com.example.response.CalculatorResponse;
import com.example.service.DemoCalculatorService;

@SpringBootTest
class SpringCalculatorDemoProjectApplicationTests {

	@Autowired
	DemoCalculatorService demoCalculatorService;
	
	 /**
	 * additionTest
	 */
	@Test
		public void additionTest() {
		    double result = 21.0;
			String details = "11.0+10.0=21.0";
			CalculatorRequest calculatorRequest = new CalculatorRequest();
			 
			double numberOne=11.0;
			double numberTwo=10.0;
			calculatorRequest.setNumberOne(numberOne);
			calculatorRequest.setNumberTwo(numberTwo);
			CalculatorResponse  expectedResult = new CalculatorResponse();
			expectedResult.setResult(result);
			expectedResult.setDetails(details);
		    CalculatorResponse actualResult = demoCalculatorService.getAdditionOfTwoNumbers(calculatorRequest);
			String actual = actualResult.toString();
			String expected = expectedResult.toString();
			assertThat(actual).isEqualTo(expected);
		}
	 
	 /**
	 * subtractionTest
	 */
	@Test
		public void subtractionTest() {
		    double result = 1.0;
			String details = "11.0-10.0=1.0";
			CalculatorRequest calculatorRequest = new CalculatorRequest();
			double numberOne=11.0;
			double numberTwo=10.0;
			calculatorRequest.setNumberOne(numberOne);
			calculatorRequest.setNumberTwo(numberTwo);
			CalculatorResponse  expectedResult = new CalculatorResponse();
			expectedResult.setResult(result);
			expectedResult.setDetails(details);
			CalculatorResponse actualResult = demoCalculatorService.getSubtractionOfTwoNumbers(calculatorRequest);
			String actual = actualResult.toString();
			String expected = expectedResult.toString();
			assertThat(actual).isEqualTo(expected);
		}	
	 
	 /**
	 * multiplicationTest
	 */
	@Test
		public void multiplicationTest() {
		    double result = 20.0;
			String details = "10.0*2.0=20.0";
			CalculatorRequest calculatorRequest = new CalculatorRequest();
			double numberOne=10.0;
			double numberTwo=2.0;
			calculatorRequest.setNumberOne(numberOne);
			calculatorRequest.setNumberTwo(numberTwo);
			CalculatorResponse  expectedResult = new CalculatorResponse();
			expectedResult.setResult(result);
			expectedResult.setDetails(details);
			CalculatorResponse actualResult = demoCalculatorService.getMultiplicationOfTwoNumbers(calculatorRequest);
			String actual = actualResult.toString();
			String expected = expectedResult.toString();
			assertThat(actual).isEqualTo(expected);
		}	
	 
	 /**
	 * multiplicationTest
	 */
	@Test
		public void divisionTest() {
		    double result = 2.0;
			String details = "10.0/5.0=2.0";
			CalculatorRequest calculatorRequest = new CalculatorRequest();
			double numberOne=10.0;
			double numberTwo=5.0;
			calculatorRequest.setNumberOne(numberOne);
			calculatorRequest.setNumberTwo(numberTwo);
			CalculatorResponse  expectedResult = new CalculatorResponse();
			expectedResult.setResult(result);
			expectedResult.setDetails(details);
			CalculatorResponse actualResult = demoCalculatorService.getDivisionOfTwoNumbers(calculatorRequest);
			String actual = actualResult.toString();
			String expected = expectedResult.toString();
			assertThat(actual).isEqualTo(expected);
		}

}
