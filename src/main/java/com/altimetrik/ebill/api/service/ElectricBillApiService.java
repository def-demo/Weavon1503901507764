package com.altimetrik.ebill.api.service;

import com.altimetrik.ebill.models.ElectricBill;


import com.altimetrik.ebill.exception.NotFoundException;
import java.util.List;

public interface ElectricBillApiService {
  
      List<ElectricBill> findAllElectricBill()
      throws NotFoundException;
  
      ElectricBill updateElectricBill(ElectricBill electricBill)
      throws NotFoundException;
  
      ElectricBill addElectricBill(ElectricBill electricBill)
      throws NotFoundException;
  
      ElectricBill findByIdElectricBill(Integer id)
      throws NotFoundException;
  
      void deleteElectricBill(Integer id)
      throws NotFoundException;
  
}

