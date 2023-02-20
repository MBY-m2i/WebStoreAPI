package com.m2i.WebStoreApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.m2i.WebStoreApi.entity.Command;

public interface CommandRepository extends JpaRepository<Command, Integer>{

}
