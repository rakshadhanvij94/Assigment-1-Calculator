package com.example.response;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CalculatorResponse implements  Serializable {

	/** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The numberOne. */
    @JsonProperty(value = "result")
    private double result;

    /** The numberTwo. */
    @JsonProperty(value = "details")
    private String details;

	/**
	 * @return result
	 */
	public double getResult() {
		return result;
	}

	/**
	 * @param result
	 */
	public void setResult(double result) {
		this.result = result;
	}

	/**
	 * @return details
	 */
	public String getDetails() {
		return details;
	}

	/**
	 * @param details
	 */
	public void setDetails(String details) {
		this.details = details;
	}

	/**
	 *toString
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CalculatorResponse [result=");
		builder.append(result);
		builder.append(", details=");
		builder.append(details);
		builder.append("]");
		return builder.toString();
	}
	
	
}