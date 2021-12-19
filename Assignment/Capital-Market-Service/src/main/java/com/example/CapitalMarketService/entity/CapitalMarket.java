package com.example.CapitalMarketService.entity;

import javax.persistence.Entity;


public class CapitalMarket {

 private String companyName;
 private Integer quantity;
 private  Double totalPrice;

 public CapitalMarket(String companyName, Integer quantity, Double totalPrice) {
  this.companyName = companyName;
  this.quantity = quantity;
  this.totalPrice = totalPrice;
 }


 public String getCompanyName() {
  return companyName;
 }

 public void setCompanyName(String companyName) {
  this.companyName = companyName;
 }

 public Integer getQuantity() {
  return quantity;
 }

 public void setQuantity(Integer quantity) {
  this.quantity = quantity;
 }

 public Double getTotalPrice() {
  return totalPrice;
 }

 public void setTotalPrice(Double totalPrice) {
  this.totalPrice = totalPrice;
 }

 public CapitalMarket(){


 }

 @Override
 public String toString() {
  return "CapitalMarket{" +
          "companyName='" + companyName + '\'' +
          ", quantity=" + quantity +
          ", totalPrice=" + totalPrice +
          '}';
 }
}
