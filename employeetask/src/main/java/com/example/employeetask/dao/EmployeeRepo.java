package com.example.employeetask.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.employeetask.entity.EmployeeEntity;

public interface EmployeeRepo extends CrudRepository<EmployeeEntity, Integer>{

}
