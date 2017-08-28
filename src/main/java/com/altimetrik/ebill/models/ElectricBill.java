package com.altimetrik.ebill.models;

import java.util.Date;

import java.util.Objects;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;






@Entity

public class ElectricBill  {
  
  
   
  
  @Id
   
  
  private Integer billId = null;
  
   
   
  
  private Date billDate = null;
  
   
   
  
  private String billName = null;
  
   
   
  
  private Double netAmount = null;
  
   
   
  
  private Integer netUnit = null;
  
   
   
  
  private Date prevBillDate = null;

  
  /**
   * {"primaryKey":true}
   **/
  public Integer getBillId() {
    return billId;
  }
  public void setBillId(Integer billId) {
    this.billId = billId;
  }

  
  /**
   * {}
   **/
  public Date getBillDate() {
    return billDate;
  }
  public void setBillDate(Date billDate) {
    this.billDate = billDate;
  }

  
  /**
   * {}
   **/
  public String getBillName() {
    return billName;
  }
  public void setBillName(String billName) {
    this.billName = billName;
  }

  
  /**
   * {}
   **/
  public Double getNetAmount() {
    return netAmount;
  }
  public void setNetAmount(Double netAmount) {
    this.netAmount = netAmount;
  }

  
  /**
   * {}
   **/
  public Integer getNetUnit() {
    return netUnit;
  }
  public void setNetUnit(Integer netUnit) {
    this.netUnit = netUnit;
  }

  
  /**
   * {}
   **/
  public Date getPrevBillDate() {
    return prevBillDate;
  }
  public void setPrevBillDate(Date prevBillDate) {
    this.prevBillDate = prevBillDate;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElectricBill electricBill = (ElectricBill) o;
    return Objects.equals(billId, electricBill.billId) &&
        Objects.equals(billDate, electricBill.billDate) &&
        Objects.equals(billName, electricBill.billName) &&
        Objects.equals(netAmount, electricBill.netAmount) &&
        Objects.equals(netUnit, electricBill.netUnit) &&
        Objects.equals(prevBillDate, electricBill.prevBillDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billId, billDate, billName, netAmount, netUnit, prevBillDate);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElectricBill {\n");
    
    sb.append("  billId: ").append(billId).append("\n");
    sb.append("  billDate: ").append(billDate).append("\n");
    sb.append("  billName: ").append(billName).append("\n");
    sb.append("  netAmount: ").append(netAmount).append("\n");
    sb.append("  netUnit: ").append(netUnit).append("\n");
    sb.append("  prevBillDate: ").append(prevBillDate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

