package com.sona.alexa.dietplan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sona.alexa.dietplan.service.DietPlanService;
import com.sona.alexa.dietplan.vo.DietPlanVO;

/**
 * @author sonali.vaid
 *
 */
@RestController
@RequestMapping("/dietplan")
public class DietPlanController {

	@Autowired
	private DietPlanService dietPlanService;

	@GetMapping("/{dayOfWeek}")
	public List<DietPlanVO> getDietPlanForDay(@PathVariable("dayOfWeek") String dayOfWeek) {
		return dietPlanService.getDietPlanDetails(dayOfWeek);
		
	}

}
