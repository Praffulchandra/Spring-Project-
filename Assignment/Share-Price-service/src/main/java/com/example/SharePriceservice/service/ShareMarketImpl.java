package com.example.SharePriceservice.service;

import com.example.SharePriceservice.entity.ShareMarket;
import com.example.SharePriceservice.repository.ShareMarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ShareMarketImpl implements ShareMarketService{

    @Autowired
    ShareMarketRepository shareMarketRepository;



    @Override
    public String addCompanyName(ShareMarket companyName) {
        Optional<ShareMarket> companyName1 = shareMarketRepository.findByCompanyName(companyName.getCompanyName());
        //Optional<Student> studentByEmail = studentRepository.findStudentByEmail(student.getEmail());
        if(companyName1.isPresent()){
            throw new IllegalStateException("Company already Exists");
        }
        ShareMarket savedObject = shareMarketRepository.save(companyName);
        return savedObject+ "Saved in DB";
    }

    @Override
    public Double getSharePrice(String companyName) {
// Optional<Student> studentByEmail = studentRepository.findStudentByEmail(student.getEmail());
           Optional<ShareMarket> companyName1 =  shareMarketRepository.findByCompanyName(companyName);
            if(companyName1.isPresent()){

                return companyName1.get().getSharePrice();
            }

            else
                throw new IllegalStateException(companyName+ " does not exist");
    }

    @Override
    public List<ShareMarket> getAllShares() {

      List<ShareMarket> allRecords =  shareMarketRepository.findAll();
        return allRecords;
    }

    @Override
    @Transactional
    public void updateSharePrice(Integer id, String companyName, Double sharePrice) {

        ShareMarket shareMarket = shareMarketRepository.findById(id).orElseThrow(()-> new IllegalStateException(
                "Company with" +companyName+ "does not exist"));
        if(companyName!= null && companyName.length()>0 && !Objects.equals(shareMarket.getCompanyName(),companyName)){
            shareMarket.setCompanyName(companyName);
        }
        if(!Objects.equals(shareMarket.getSharePrice(),sharePrice)){
            shareMarket.setSharePrice(sharePrice);
        }


    }

    @Override
    public ShareMarket getSharePrices(String companyNames) {
        Optional<ShareMarket> companyName1 =  shareMarketRepository.findByCompanyName(companyNames);
        if(companyName1.isPresent()){

            return companyName1.get();
        }

        else
            throw new IllegalStateException(companyName1+ " does not exist");
    }

}
