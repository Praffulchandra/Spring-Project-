package com.example.SharePriceservice.repository;

import com.example.SharePriceservice.entity.ShareMarket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ShareMarketRepository extends JpaRepository<ShareMarket, Integer> {

    Optional<ShareMarket> findByCompanyName(String companyName);
}
