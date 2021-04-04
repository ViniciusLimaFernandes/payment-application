package com.payment.service.repository;

import com.payment.service.entity.SellingProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellingProductRepository extends JpaRepository<SellingProduct, Long> {
}
