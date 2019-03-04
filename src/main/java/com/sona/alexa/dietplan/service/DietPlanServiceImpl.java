package com.sona.alexa.dietplan.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.sona.alexa.dietplan.vo.DietPlanVO;

/**
 * @author sonali.vaid
 *
 */
@Service
public class DietPlanServiceImpl implements DietPlanService {

	@Override
	public List<DietPlanVO> getDietPlanDetails(String dayOfWeek) {

//		DietPlanVO dietPlanVO = new DietPlanVO();

		// create map to store
        HashMap<String, List<DietPlanVO>> dietPlanMap = new HashMap<String, List<DietPlanVO>>();
        dietPlanMap.put("Monday", getDietForMonday());
        
//        if(dietPlanMap.containsKey(dayOfWeek)) {
        	return dietPlanMap.values().stream()
                    .flatMap(Collection::stream)
                    .collect(Collectors.toList());
        	
//        }
	}
	
	private List<DietPlanVO> getDietForMonday(){
		List<DietPlanVO> dietPlanVos = new ArrayList<>();
		DietPlanVO dietVo1 = new DietPlanVO();
		dietVo1.setItemName("Almonds");
		dietVo1.setItemCategory("Nuts");
		dietVo1.setItemQuantity(10);		
		dietPlanVos.add(dietVo1);
		
		DietPlanVO dietVo2 = new DietPlanVO();
		dietVo2.setItemName("Apple");
		dietVo2.setItemCategory("Fruit");
		dietVo2.setItemQuantity(1);		
		dietPlanVos.add(dietVo2);
		
		return dietPlanVos;
		
	}
}
