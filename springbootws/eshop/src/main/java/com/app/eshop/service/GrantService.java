package com.app.eshop.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.eshop.dto.GrantDto;
import com.app.eshop.entity.Grant;
import com.app.eshop.repository.GrantRepository;

@Service
public class GrantService {
		@Autowired
		private GrantRepository grantRepository;
		public void processGrant(List<GrantDto> grantDtos) {
			 List<Grant> grantlist = new ArrayList<Grant>();
			 grantDtos.forEach(e->{
				 Grant grant = new Grant();
				 BeanUtils.copyProperties(e, grant);
				 grant.setGrantStatus("open");
				 grant.setAcceptedDate(LocalDate.now());
				 grant.setAllocation("open");
				 grant.setIsAccepted(false);
				 grantlist.add(grant);
			 });
			 grantRepository.saveAll(grantlist);
		}
		
		public void approveGrant(List<Long> grantIdList) {
			grantIdList.forEach(e->{
				Grant grant = grantRepository.findById(e).get();
				grant.setGrantStatus("approve");
				grant.setIsAccepted(true);
				grantRepository.save(grant);
			});
		}
		public Optional<List<Grant>> getGrantsForAllocationById(Long planId){
			return grantRepository.findByPlanId(planId);
					
		}
		public void updateGrant(Grant grant) {
			grant.setAllocation("allocated");
			grantRepository.save(grant);
		}
		public Grant getGrantById(Long id) {
			return grantRepository.findById(id).get();
		}
}
