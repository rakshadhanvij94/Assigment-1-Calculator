package com.example.jpa;

import java.time.LocalDateTime;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "calculatorDataEntity")
public class CalculatorDataEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "numberOne")
	private double numberOne;
	
	@Column(name = "numberTwo")
	private double numberTwo;
	
	@Column(name = "operation")
	private String operation;
	
	@Column(name = "result")
	private double result;
	
	@Column(name = "timestamp")
	private LocalDateTime timeStamp;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getNumberOne() {
		return numberOne;
	}

	public void setNumberOne(double numberOne) {
		this.numberOne = numberOne;
	}

	public double getNumberTwo() {
		return numberTwo;
	}

	public void setNumberTwo(double numberTwo) {
		this.numberTwo = numberTwo;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CalculatorDataEntity [id=");
		builder.append(id);
		builder.append(", numberOne=");
		builder.append(numberOne);
		builder.append(", numberTwo=");
		builder.append(numberTwo);
		builder.append(", operation=");
		builder.append(operation);
		builder.append(", result=");
		builder.append(result);
		builder.append(", timeStamp=");
		builder.append(timeStamp);
		builder.append("]");
		return builder.toString();
	}
	
	
}
