package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Doc;

public interface DocRepository extends JpaRepository<Doc, Integer>{

}
