package com.example.SharePriceservice.service;

import com.example.SharePriceservice.entity.ShareMarket;

import java.util.List;

public interface ShareMarketService {

    public String addCompanyName(ShareMarket companyName);
    public Double getSharePrice(String companyName);
    public List<ShareMarket> getAllShares();

    void updateSharePrice(Integer shareId, String companyName, Double sharePrice);

    ShareMarket getSharePrices(String companyNames);
}
