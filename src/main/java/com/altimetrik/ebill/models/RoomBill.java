package com.altimetrik.ebill.models;

import java.util.Date;
import com.altimetrik.ebill.models.ElectricBill;

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

public class RoomBill  {
  
  
   
  
  @Id
   
  
  private Integer roomId = null;
  
   
   
  
  private Double amount = null;
  
   
   
  
  private Date prevBillDate = null;
  
   
   
  
  private String roomName = null;
  
   
    @OneToOne(fetch = FetchType.EAGER )
  @JoinColumn(name = "bill_id", insertable=false, updatable=false) 
  
  private ElectricBill electricBill = null;

  
  /**
   * {"primaryKey":true}
   **/
  public Integer getRoomId() {
    return roomId;
  }
  public void setRoomId(Integer roomId) {
    this.roomId = roomId;
  }

  
  /**
   * {}
   **/
  public Double getAmount() {
    return amount;
  }
  public void setAmount(Double amount) {
    this.amount = amount;
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

  
  /**
   * {}
   **/
  public String getRoomName() {
    return roomName;
  }
  public void setRoomName(String roomName) {
    this.roomName = roomName;
  }

  
  /**
   * {"foreignKeyColumn":"bill_id","relation":"OneToOne"}
   **/
  public ElectricBill getElectricBill() {
    return electricBill;
  }
  public void setElectricBill(ElectricBill electricBill) {
    this.electricBill = electricBill;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomBill roomBill = (RoomBill) o;
    return Objects.equals(roomId, roomBill.roomId) &&
        Objects.equals(amount, roomBill.amount) &&
        Objects.equals(prevBillDate, roomBill.prevBillDate) &&
        Objects.equals(roomName, roomBill.roomName) &&
        Objects.equals(electricBill, roomBill.electricBill);
  }

  @Override
  public int hashCode() {
    return Objects.hash(roomId, amount, prevBillDate, roomName, electricBill);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomBill {\n");
    
    sb.append("  roomId: ").append(roomId).append("\n");
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("  prevBillDate: ").append(prevBillDate).append("\n");
    sb.append("  roomName: ").append(roomName).append("\n");
    sb.append("  electricBill: ").append(electricBill).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

