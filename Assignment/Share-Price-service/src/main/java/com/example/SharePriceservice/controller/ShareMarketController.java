package com.example.SharePriceservice.controller;

import com.example.SharePriceservice.entity.ShareMarket;
import com.example.SharePriceservice.service.ShareMarketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//client always talks to controller
@RestController
@RequestMapping(value = "/share-price")
public class ShareMarketController {

    @Autowired
    ShareMarketService shareMarketService;

    @PostMapping(value = "/")
    public String saveCompany(@RequestBody ShareMarket shareMarket){

       return shareMarketService.addCompanyName(shareMarket);
    }

    @GetMapping(value = "/{CompanyName}")
    public Double getPriceByCompanyName(@PathVariable ("CompanyName") String companyName){
        return shareMarketService.getSharePrice(companyName);
    }


    @GetMapping(value = "/getAllCompany")
    public List<ShareMarket> getAllCompanyName(){

        return shareMarketService.getAllShares();
    }
    @PutMapping(value = "{id}")
    public void updateSharePrice(
        @PathVariable("id") Integer id,
        @RequestParam(required = false) String companyName,
        @RequestParam(required = false) Double sharePrice
    ){
        shareMarketService.updateSharePrice(id, companyName, sharePrice);

    }


}
