package com.example.calci;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(DemoCalculatorController.class)
class DemoCalculatorControllerTest {
	
	@Autowired
	DemoCalculatorService demoCalculatorService;
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	void testAddition() throws Exception {
		//demoCalculatorService.getAdditionOfTwoNumbers(12, 23);
		//mockMvc.perform(MockMvcRequestBuilders.get("/addition").param("number1", "12").param("number2", "12"))
		//.andExpect(status().isOk())
		//.andExpect((ResultMatcher) content().json("{\"result\":24,\"details\":\"12+12=24\"}"));
		
        //when(demoCalculatorService.getAdditionOfTwoNumbers(5, 3)).thenReturn(8.0);
		//when(demoCalculatorService.getAdditionOfTwoNumbers(5.0,3.0)).thenReturn(8.0,"5.0+3.0=8.0");

		//when(calculatorResponse.getDetails()).thenReturn("5 + 3 = 8");
		
		mockMvc.perform(get("/addition")
				.param("number1","5")
				.param("number2","3")
				.contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect( content().json("{\"addition\":8.0,\"details\":\"5.0 + 3.0 = 8.0\"}"));
	}

	@Test
	void testSubtraction() {
	  
	}

	@Test
	void testMultiplication() {
	}

	@Test
	void testDivision() {
	}

}
