package com.example.employeetask.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employeetask.dao.EmployeeRepo;
import com.example.employeetask.entity.EmployeeEntity;

@Service
public class EmployeeServiceimpl implements EmployeeService {
	
	@Autowired
	EmployeeRepo employeeRepo;
	
	public static Map<String, String> map=new HashMap<>();

	@Override
	public boolean validateEmployee(EmployeeEntity employeeEntity) {

		boolean flag = false;

		if (employeeEntity.getEmpName() != null && !employeeEntity.getEmpName().isBlank()
				&& !employeeEntity.getEmpName().isEmpty()) {
			flag = true;
			System.out.println("Employee Name is Valid");

		} else {
			flag = false;
			System.out.println("Employe Name is Invalid");
			map.put("eName", "please enter employee name");
			return flag;
		}
		if (employeeEntity.getEmpCourse() != null && !employeeEntity.getEmpCourse().isBlank()
				&& !employeeEntity.getEmpCourse().isEmpty()) {
			flag = true;
			System.out.println("Employee Course is Valid");

		} else {
			flag = false;
			System.out.println("Employe Course is Invalid");
			map.put("eCource", "please enter employee course");
			return flag;
		}
		if (employeeEntity.getEmpGender() != null && !employeeEntity.getEmpGender().isBlank()
				&& !employeeEntity.getEmpGender().isEmpty()) {
			flag = true;
			System.out.println("Employee gender is Valid");

		} else {
			flag = false;
			System.out.println("Employe gender is Invalid");
			map.put("eGender", "please select employee gender");
			return flag;
		}

		if (employeeEntity.getEmpMail() != null && !employeeEntity.getEmpMail().isBlank()
				&& !employeeEntity.getEmpMail().isEmpty()) {
			flag = true;
			System.out.println("Employee mail is Valid");

		} else {
			flag = false;
			System.out.println("Employe mail is Invalid");
			map.put("eMail", "please enter employee mail id");
			return flag;
		}

		if (employeeEntity.getEmpPhone() != null && !employeeEntity.getEmpPhone().isBlank()
				&& !employeeEntity.getEmpPhone().isEmpty()) {
			flag = true;
			System.out.println("Employee phone is Valid");

		} else {
			flag = false;
			System.out.println("Employe phone is Invalid");
			map.put("ePhone", "please enter employee phone no");
			return flag;
		}

		if (employeeEntity.getEmpDate() != null && !employeeEntity.getEmpDate().isBlank()
				&& !employeeEntity.getEmpDate().isEmpty()) {
			flag = true;
			System.out.println("Employee Dob is Valid");

		} else {
			flag = false;
			System.out.println("Employe Dob is Invalid");
			map.put("eDob", "please enter employee dob");
			return flag;
		}

		if (employeeEntity.getEmpAddress() != null && !employeeEntity.getEmpAddress().isBlank()
				&& !employeeEntity.getEmpAddress().isEmpty()) {
			flag = true;
			System.out.println("Employee Address is Valid");

		} else {
			flag = false;
			System.out.println("Employe Address is Invalid");
			map.put("eAddress", "please enter employee current address");
			return flag;
		}

		if (employeeEntity.getEmpFile() != null) {
			flag = true;
			System.out.println("Employee File is Valid");

		} else {
			flag = false;
			System.out.println("Employe File is Invalid");
			map.put("eFile", "please attach identity proof");
			return flag;
		}

		return flag;
	}

	@Override
	public boolean saveData(EmployeeEntity employeeEntity) {
		employeeRepo.save(employeeEntity);
		return true;
	}



}
