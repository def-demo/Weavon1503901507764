package com.altimetrik.ebill.api;

import com.altimetrik.ebill.models.*;

import com.altimetrik.ebill.api.service.RoomMatesApiService;

import com.altimetrik.ebill.exception.NotFoundException;

import com.altimetrik.ebill.models.RoomMates;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import static org.springframework.http.MediaType.*;

@Controller
@RequestMapping(value = "/api" )

public class RoomMatesApi {

   @Autowired
   private RoomMatesApiService service;
  

  @RequestMapping(value = "/room_mates", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<RoomMates>> findAllRoomMates()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<RoomMates>>(service.findAllRoomMates(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/room_mates", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< RoomMates> updateRoomMates(@RequestBody RoomMates roomMates
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<RoomMates>(service.updateRoomMates(roomMates), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/room_mates", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< RoomMates> addRoomMates(@RequestBody RoomMates roomMates
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<RoomMates>(service.addRoomMates(roomMates), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/room_mates/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< RoomMates> findByIdRoomMates(@PathVariable("id") Integer id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<RoomMates>(service.findByIdRoomMates(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/room_mates/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteRoomMates(@PathVariable("id") Integer id
)
      throws NotFoundException {
        
       	  service.deleteRoomMates(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

