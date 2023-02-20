package com.m2i.WebStoreApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.m2i.WebStoreApi.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{}