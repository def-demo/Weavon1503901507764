package com.altimetrik.ebill.models.repository;

import com.altimetrik.ebill.models.*;

import com.altimetrik.ebill.models.RoomBill;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface RoomMatesRepository extends JpaRepository<RoomMates, Integer>{

}



