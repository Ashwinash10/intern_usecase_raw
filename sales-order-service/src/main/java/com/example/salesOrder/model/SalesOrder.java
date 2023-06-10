package com.example.salesOrder.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SalesOrder 
{
@Id
//@GeneratedValue(strategy=GenerationType.AUTO)
private int custId;
private int orderId;
private String orderDescription;
private Date orderDate;
private int totalPrice;
public int getCustId() {
	return custId;
}
public void setCustId(int custId) {
	this.custId = custId;
}
public int getOrderId() {
	return orderId;
}
public void setOrderId(int orderId) {
	this.orderId = orderId;
}
public String getOrderDescription() {
	return orderDescription;
}
public void setOrderDescription(String orderDescription) {
	this.orderDescription = orderDescription;
}
public Date getOrderDate() {
	return orderDate;
}
public void setOrderDate(Date orderDate) {
	this.orderDate = orderDate;
}
public int getTotalPrice() {
	return totalPrice;
}
public void setTotalPrice(int totalPrice) {
	this.totalPrice = totalPrice;
}

}
