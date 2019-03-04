package com.sona.alexa.dietplan.service;

import java.util.HashMap;
import java.util.List;

import com.sona.alexa.dietplan.vo.DietPlanVO;

/**
 * @author sonali.vaid
 *
 */


public interface DietPlanService {

	 public List<DietPlanVO> getDietPlanDetails(String dayOfWeek);
}


