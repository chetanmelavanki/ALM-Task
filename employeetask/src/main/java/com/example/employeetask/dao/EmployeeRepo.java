package com.example.employeetask.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employeetask.entity.EmployeeEntity;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity, Integer> {

}
