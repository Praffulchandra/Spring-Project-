package com.example.CapitalMarketService.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


//we use below line to change the table name if we want different from class name
//@Table(name = "Stock Market ")\

public class ShareMarket {

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String companyName;
    private Double sharePrice;

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Double getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(Double sharePrice) {
        this.sharePrice = sharePrice;
    }

    public ShareMarket(Integer id, String companyName, double sharePrice) {
        this.id = id;
        this.companyName = companyName;
        this.sharePrice = sharePrice;
    }

    public ShareMarket() {
    }

    @Override
    public String toString() {
        return "ShareMarket{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", sharePrice=" + sharePrice +
                '}';
    }
}
