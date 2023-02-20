package com.m2i.WebStoreApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.m2i.WebStoreApi.entity.UserInformations;

public interface UserInformationsRepository extends JpaRepository<UserInformations, Integer>{}