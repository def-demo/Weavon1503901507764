package com.altimetrik.ebill.models.repository;

import com.altimetrik.ebill.models.*;

import java.util.Date;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface ElectricBillRepository extends JpaRepository<ElectricBill, Integer>{

}



