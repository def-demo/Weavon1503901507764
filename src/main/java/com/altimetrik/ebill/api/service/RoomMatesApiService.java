package com.altimetrik.ebill.api.service;

import com.altimetrik.ebill.models.RoomMates;


import com.altimetrik.ebill.exception.NotFoundException;
import java.util.List;

public interface RoomMatesApiService {
  
      List<RoomMates> findAllRoomMates()
      throws NotFoundException;
  
      RoomMates updateRoomMates(RoomMates roomMates)
      throws NotFoundException;
  
      RoomMates addRoomMates(RoomMates roomMates)
      throws NotFoundException;
  
      RoomMates findByIdRoomMates(Integer id)
      throws NotFoundException;
  
      void deleteRoomMates(Integer id)
      throws NotFoundException;
  
}

