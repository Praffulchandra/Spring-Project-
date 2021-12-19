package com.example.CapitalMarketService.controller;

import com.example.CapitalMarketService.service.CapitalMarketServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping(value = "/capitalMarket/price")
public class CapitalMarketController {

        @Autowired
         WebClient.Builder webClientBuilder;

        @Autowired
        CapitalMarketServices capitalMarketServices;


        @GetMapping(value = "/{companyName}/quantity/{quantity}")
        public String getTotalInfo(@PathVariable ("companyName") String companyName, @PathVariable("quantity") Integer quantity){


         return capitalMarketServices.getShareInfo(companyName,quantity);
}
}
