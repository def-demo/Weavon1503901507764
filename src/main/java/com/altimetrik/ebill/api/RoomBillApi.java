package com.altimetrik.ebill.api;

import com.altimetrik.ebill.models.*;

import com.altimetrik.ebill.api.service.RoomBillApiService;

import com.altimetrik.ebill.exception.NotFoundException;

import com.altimetrik.ebill.models.RoomBill;


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

public class RoomBillApi {

   @Autowired
   private RoomBillApiService service;
  

  @RequestMapping(value = "/room_bill", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<RoomBill>> findAllRoomBill()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<RoomBill>>(service.findAllRoomBill(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/room_bill", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< RoomBill> updateRoomBill(@RequestBody RoomBill roomBill
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<RoomBill>(service.updateRoomBill(roomBill), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/room_bill", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< RoomBill> addRoomBill(@RequestBody RoomBill roomBill
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<RoomBill>(service.addRoomBill(roomBill), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/room_bill/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< RoomBill> findByIdRoomBill(@PathVariable("id") Integer id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<RoomBill>(service.findByIdRoomBill(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/room_bill/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteRoomBill(@PathVariable("id") Integer id
)
      throws NotFoundException {
        
       	  service.deleteRoomBill(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

