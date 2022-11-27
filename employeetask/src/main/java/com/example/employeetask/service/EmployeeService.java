package com.example.employeetask.service;

import com.example.employeetask.entity.EmployeeEntity;

public interface EmployeeService {

	boolean validateEmployee(EmployeeEntity employeeEntity);

	boolean saveData(EmployeeEntity employeeEntity);

	boolean updateEmployeById(EmployeeEntity employeeEntity);



//	boolean isValidId(int empId);



	
}
