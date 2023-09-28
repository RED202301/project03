package com.mo.whatisthis.apis.payment.repositories;

import com.mo.whatisthis.apis.payment.entities.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<PaymentEntity, Long> {
    
}