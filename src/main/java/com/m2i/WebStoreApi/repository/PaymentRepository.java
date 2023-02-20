package com.m2i.WebStoreApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.m2i.WebStoreApi.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer>{

}
