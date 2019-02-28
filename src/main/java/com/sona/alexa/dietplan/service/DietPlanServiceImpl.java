package com.sona.alexa.dietplan.service;

import org.springframework.stereotype.Service;

import com.sona.alexa.dietplan.vo.DietPlanVO;

/**
 * @author sonali.vaid
 *
 */
@Service
public class DietPlanServiceImpl implements DietPlanService {

	@Override
	public DietPlanVO getDietPlanDetails(String dayOfWeek) {

		DietPlanVO dietPlanVO = new DietPlanVO();
		switch (dayOfWeek) {
		case "Monday":
			dietPlanVO.setItemName("Orange");
			dietPlanVO.setItemQuantity(1);
			dietPlanVO.setItemName("Almonds");
			dietPlanVO.setItemQuantity(5);
			return dietPlanVO;
		case "Tuesday":
			dietPlanVO.setItemName("Apple");
			dietPlanVO.setItemQuantity(1);
			dietPlanVO.setItemName("Walnuts");
			dietPlanVO.setItemQuantity(5);
			return dietPlanVO;
		default:
			dietPlanVO.setItemName("Banana");
			dietPlanVO.setItemQuantity(1);
			dietPlanVO.setItemName("Nuts");
			dietPlanVO.setItemQuantity(5);
			return dietPlanVO;
		}
	}
}
