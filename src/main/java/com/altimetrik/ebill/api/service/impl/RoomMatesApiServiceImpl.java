package com.altimetrik.ebill.api.service.impl;

import com.altimetrik.ebill.api.service.*;
import com.altimetrik.ebill.models.*;
import org.springframework.stereotype.Service;
import com.altimetrik.ebill.models.repository.*;
import org.springframework.http.HttpStatus;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.altimetrik.ebill.models.RoomMates;


import java.util.List;
import com.altimetrik.ebill.exception.NotFoundException;


@Service
@Transactional
public class RoomMatesApiServiceImpl implements RoomMatesApiService {
		  	  
	  @Autowired
	
  	  private RoomMatesRepository  roomMatesRepository ;
	   
  
  
				
			
      @Override
      public List<RoomMates> findAllRoomMates()
      throws NotFoundException {
      
        
  		
  		
  			return roomMatesRepository.findAll();
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public RoomMates updateRoomMates(RoomMates roomMates)
      throws NotFoundException {
      
         
        	return roomMatesRepository.save(roomMates);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public RoomMates addRoomMates(RoomMates roomMates)
      throws NotFoundException {
      
         
        	return roomMatesRepository.save(roomMates);
  		
  		
  		
  		
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public RoomMates findByIdRoomMates(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		  return roomMatesRepository.findOne(id); 
  		
  		
  		
  		
  		
  }
  
				
			
      @Override
      public void deleteRoomMates(Integer id)
      throws NotFoundException {
      
        
  		
  		
  		
  		
  		
  		 
			
			
  		
  		
  		
  }
  
}

