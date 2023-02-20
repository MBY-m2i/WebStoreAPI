package com.m2i.WebStoreApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.m2i.WebStoreApi.entity.Article;

public interface ArticleRepository extends JpaRepository<Article, Integer>{

}
