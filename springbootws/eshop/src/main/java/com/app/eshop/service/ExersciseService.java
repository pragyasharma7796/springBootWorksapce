package com.app.eshop.service;

import java.time.LocalDate;

import javax.validation.GroupSequence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.app.eshop.dto.ExersicDto;
import com.app.eshop.entity.Exercises;
import com.app.eshop.entity.ExersciseActivity;
import com.app.eshop.entity.Grant;
import com.app.eshop.repository.ExerciseRepository;
import com.app.eshop.repository.ExersciseAcivityRepository;

@Controller
public class ExersciseService {
	@Autowired
	ExersciseAcivityRepository acivityRepository;
	
	@Autowired
	ExerciseRepository exciseRepository;
	
	@Autowired
	GrantService grantService;
	public void sellOption(ExersicDto dto) {
		Grant grant = grantService.getGrantById(dto.getGrantId());
		System.out.println(grant+"---------------");
		if(grant != null) {
			if(grant.getLockInStatus().equals("open") ) {
				Exercises exercises = getExerciseByGrantId(grant.getId());
				double amount = exercises.getVestedOption() - dto.getOption();
				if(amount < dto.getOption()) {
					exercises.setSoldOption(amount);
					System.out.println("amount----------");
					exciseRepository.save(exercises);
					ExersciseActivity activity = new ExersciseActivity();
					activity.setGrantId(grant.getId());
					activity.setEmployeeId(dto.getEmpId().toString());
					activity.setSoldOption(amount);
					activity.setStatus("pending");
					activity.setCreatedDate(LocalDate.now().toString());
					System.err.println(activity);
					acivityRepository.save(activity);
				}
			}
		}
	}
	
	public Exercises getExerciseByGrantId(Long id) {
		return exciseRepository.findByGrantId(id);
	}
}
