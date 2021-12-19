package com.example.CapitalMarketService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class CapitalMarketServices {

    @Autowired
    WebClient.Builder webClientBuilder;



public String getShareInfo(String companyName, Integer quantity){


    //ShareMarket shareMarket = restTemplate.getForObject("http://SHARE-MARKET-SERVICE/share-price/get/" +companyName, ShareMarket.class);
    Double shareMarketPrice = webClientBuilder.build()
            .get()
            .uri("http://SHARE-MARKET-SERVICE/share-price/" +companyName)
            .retrieve()
            .bodyToMono(Double.class)
            .block(); // check subscribe option
        //post operation
    Double d = shareMarketPrice * quantity;


      return "company: " +companyName+
                "\nPrice per share: " +shareMarketPrice+
            "\nQuantity: " +quantity+
            "\nTotalAmount: " +d;


}

}
