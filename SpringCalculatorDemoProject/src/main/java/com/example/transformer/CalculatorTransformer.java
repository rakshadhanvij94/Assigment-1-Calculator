package com.example.transformer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.constants.Constants;
import com.example.dao.CalculatorDemoDaoImpl;
import com.example.jpa.CalculatorDataEntity;
import com.example.response.CalculatorResponse;
import com.example.util.Utils;

@Component("calculatorTransformer")
public class CalculatorTransformer {

	/**
	 * @param calculatorData
	 * @return
	 */
	public CalculatorResponse transformToDomain(CalculatorDataEntity calculatorData) {
		CalculatorResponse calculatorResponse = new CalculatorResponse();
		calculatorResponse.setResult(calculatorData.getResult());
		calculatorResponse.setDetails(getDetailsResponse(calculatorData));
		return calculatorResponse;
	}

	/**
	 * @param calculatorDataEntity
	 * @return
	 */
	public String getDetailsResponse(CalculatorDataEntity calculatorDataEntity) {
		if (calculatorDataEntity.getOperation().equals(Constants.ADDITION))
			return calculatorDataEntity.getNumberOne() + " + " + (calculatorDataEntity.getNumberTwo()) + " = "
					+ (calculatorDataEntity.getResult());

		if (calculatorDataEntity.getOperation().equals(Constants.SUBSTRACTION))
			return (calculatorDataEntity.getNumberOne()) + " - " + (calculatorDataEntity.getNumberTwo()) + " = "
					+ (calculatorDataEntity.getResult());

		if (calculatorDataEntity.getOperation().equals(Constants.MULTIPLICATION))
			return calculatorDataEntity.getNumberOne() + " * " + (calculatorDataEntity.getNumberTwo()) + " = "
					+ (calculatorDataEntity.getResult());

		if (calculatorDataEntity.getOperation().equals(Constants.DIVISION))
			return (calculatorDataEntity.getNumberOne()) + " / " + (calculatorDataEntity.getNumberTwo()) + " = "
					+ (calculatorDataEntity.getResult());

		return null;
	}
	
}
