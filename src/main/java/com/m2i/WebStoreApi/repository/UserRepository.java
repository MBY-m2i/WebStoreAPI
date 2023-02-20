package com.m2i.WebStoreApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.m2i.WebStoreApi.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{}