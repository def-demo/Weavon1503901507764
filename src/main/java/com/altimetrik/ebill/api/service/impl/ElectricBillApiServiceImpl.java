package com.altimetrik.ebill.api.service.impl;

import com.altimetrik.ebill.api.service.*;
import com.altimetrik.ebill.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.ebill.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.ebill.models.ElectricBill;


import java.util.List;
import com.altimetrik.ebill.exception.NotFoundException;


@Service
@Transactional
public class ElectricBillApiServiceImpl implements ElectricBillApiService {
		  	  
	  @Autowired
	
  	  private ElectricBillRepository  electricBillRepository ;
	   
  
  
				
			
      @Override
      public List<ElectricBill> findAllElectricBill()
      throws NotFoundException {
      
        
  		
  		
  			return electricBillRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public ElectricBill updateElectricBill(ElectricBill electricBill)
      throws NotFoundException {
      
         
        	return electricBillRepository.save(electricBill);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public ElectricBill addElectricBill(ElectricBill electricBill)
      throws NotFoundException {
      
         
        	return electricBillRepository.save(electricBill);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public ElectricBill findByIdElectricBill(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return electricBillRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteElectricBill(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

