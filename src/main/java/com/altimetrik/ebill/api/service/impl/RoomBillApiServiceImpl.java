package com.altimetrik.ebill.api.service.impl;

import com.altimetrik.ebill.api.service.*;
import com.altimetrik.ebill.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.ebill.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.ebill.models.RoomBill;


import java.util.List;
import com.altimetrik.ebill.exception.NotFoundException;


@Service
@Transactional
public class RoomBillApiServiceImpl implements RoomBillApiService {
		  	  
	  @Autowired
	
  	  private RoomBillRepository  roomBillRepository ;
	   
  
  
				
			
      @Override
      public List<RoomBill> findAllRoomBill()
      throws NotFoundException {
      
        
  		
  		
  			return roomBillRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public RoomBill updateRoomBill(RoomBill roomBill)
      throws NotFoundException {
      
         
        	return roomBillRepository.save(roomBill);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public RoomBill addRoomBill(RoomBill roomBill)
      throws NotFoundException {
      
         
        	return roomBillRepository.save(roomBill);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public RoomBill findByIdRoomBill(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return roomBillRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteRoomBill(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

