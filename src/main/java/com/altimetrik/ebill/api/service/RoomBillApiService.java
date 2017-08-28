package com.altimetrik.ebill.api.service;

import com.altimetrik.ebill.models.RoomBill;


import com.altimetrik.ebill.exception.NotFoundException;
import java.util.List;

public interface RoomBillApiService {
  
      List<RoomBill> findAllRoomBill()
      throws NotFoundException;
  
      RoomBill updateRoomBill(RoomBill roomBill)
      throws NotFoundException;
  
      RoomBill addRoomBill(RoomBill roomBill)
      throws NotFoundException;
  
      RoomBill findByIdRoomBill(Integer id)
      throws NotFoundException;
  
      void deleteRoomBill(Integer id)
      throws NotFoundException;
  
}

