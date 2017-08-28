package com.altimetrik.ebill.models;

import com.altimetrik.ebill.models.RoomBill;

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

public class RoomMates  {
  
  
   
  
  @Id
   
  
  private Integer id = null;
  
   
   
  
  private String amount = null;
  
   
   
  
  private String name = null;
  
   
    @OneToOne(fetch = FetchType.EAGER )
  @JoinColumn(name = "room_id", insertable=false, updatable=false) 
  
  private RoomBill roomBill = null;

  
  /**
   * {"primaryKey":true}
   **/
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  
  /**
   * {}
   **/
  public String getAmount() {
    return amount;
  }
  public void setAmount(String amount) {
    this.amount = amount;
  }

  
  /**
   * {}
   **/
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * {"foreignKeyColumn":"room_id","relation":"OneToOne"}
   **/
  public RoomBill getRoomBill() {
    return roomBill;
  }
  public void setRoomBill(RoomBill roomBill) {
    this.roomBill = roomBill;
  }

  

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoomMates roomMates = (RoomMates) o;
    return Objects.equals(id, roomMates.id) &&
        Objects.equals(amount, roomMates.amount) &&
        Objects.equals(name, roomMates.name) &&
        Objects.equals(roomBill, roomMates.roomBill);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, amount, name, roomBill);
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoomMates {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  amount: ").append(amount).append("\n");
    sb.append("  name: ").append(name).append("\n");
    sb.append("  roomBill: ").append(roomBill).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

