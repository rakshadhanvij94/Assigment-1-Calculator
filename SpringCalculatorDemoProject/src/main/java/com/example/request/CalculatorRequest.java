package com.example.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CalculatorRequest {

	/** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The numberOne. */
    @JsonProperty(value = "numberOne")
    private double numberOne;

    /** The numberTwo. */
    @JsonProperty(value = "numberTwo")
    private double numberTwo;

	/**
	 * @return numberOne
	 */
	public double getNumberOne() {
		return numberOne;
	}

	/**
	 * @param numberOne
	 */
	public void setNumberOne(double numberOne) {
		this.numberOne = numberOne;
	}

	/**
	 * @return numberTwo
	 */
	public double getNumberTwo() {
		return numberTwo;
	}

	/**
	 * @param numberTwo
	 */
	public void setNumberTwo(double numberTwo) {
		this.numberTwo = numberTwo;
	}

	/**
	 * toString
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CalculatorRequest [numberOne=");
		builder.append(numberOne);
		builder.append(", numberTwo=");
		builder.append(numberTwo);
		builder.append("]");
		return builder.toString();
	}
	
	
}