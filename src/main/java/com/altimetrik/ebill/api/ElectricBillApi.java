package com.altimetrik.ebill.api;

import com.altimetrik.ebill.models.*;

import com.altimetrik.ebill.api.service.ElectricBillApiService;

import com.altimetrik.ebill.exception.NotFoundException;

import com.altimetrik.ebill.models.ElectricBill;


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

public class ElectricBillApi {

   @Autowired
   private ElectricBillApiService service;
  

  @RequestMapping(value = "/electric_bill", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< List<ElectricBill>> findAllElectricBill()
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<List<ElectricBill>>(service.findAllElectricBill(), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/electric_bill", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.PUT)
  public ResponseEntity< ElectricBill> updateElectricBill(@RequestBody ElectricBill electricBill
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<ElectricBill>(service.updateElectricBill(electricBill), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/electric_bill", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.POST)
  public ResponseEntity< ElectricBill> addElectricBill(@RequestBody ElectricBill electricBill
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<ElectricBill>(service.addElectricBill(electricBill), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/electric_bill/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.GET)
  public ResponseEntity< ElectricBill> findByIdElectricBill(@PathVariable("id") Integer id
)
      throws NotFoundException {
       
  	    
       	  return new ResponseEntity<ElectricBill>(service.findByIdElectricBill(id), HttpStatus.OK);
   	    
  }

  

  @RequestMapping(value = "/electric_bill/{id}", 
    produces = { "application/json" }, 
    consumes = { "application/json" },
    method = RequestMethod.DELETE)
  public ResponseEntity< Void> deleteElectricBill(@PathVariable("id") Integer id
)
      throws NotFoundException {
        
       	  service.deleteElectricBill(id);
  		  return new ResponseEntity<Void>(HttpStatus.OK);
  		
  	    
  }

  
}

