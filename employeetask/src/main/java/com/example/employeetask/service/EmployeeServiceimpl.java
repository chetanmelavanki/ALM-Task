package com.example.employeetask.service;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import javax.print.Doc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.employeetask.dao.EmployeeDAO;
import com.example.employeetask.dao.EmployeeRepo;
import com.example.employeetask.entity.EmployeeEntity;

@Service
public class EmployeeServiceimpl implements EmployeeService {

	@Autowired
	EmployeeRepo employeeRepo;

	@Autowired
	EmployeeDAO employeeDAO;

	public static Map<Integer, String> map = new HashMap<>();

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
			map.put(1, "please enter employee name");
			return flag;
		}
		if (employeeEntity.getEmpCourse() != null && !employeeEntity.getEmpCourse().isBlank()
				&& !employeeEntity.getEmpCourse().isEmpty()) {
			flag = true;
			System.out.println("Employee Course is Valid");

		} else {
			flag = false;
			System.out.println("Employe Course is Invalid");
			map.put(2, "please enter employee course");
			return flag;
		}
		if (employeeEntity.getEmpGender() != null && !employeeEntity.getEmpGender().isBlank()
				&& !employeeEntity.getEmpGender().isEmpty()) {
			flag = true;
			System.out.println("Employee gender is Valid");

		} else {
			flag = false;
			System.out.println("Employe gender is Invalid");
			map.put(3, "please select employee gender");
			return flag;
		}

		if (employeeEntity.getEmpMail() != null && !employeeEntity.getEmpMail().isBlank()
				&& !employeeEntity.getEmpMail().isEmpty()) {
			flag = true;
			System.out.println("Employee mail is Valid");

		} else {
			flag = false;
			System.out.println("Employe mail is Invalid");
			map.put(4, "please enter employee mail id");
			return flag;
		}

		if (employeeEntity.getEmpPhone() != null && !employeeEntity.getEmpPhone().isBlank()
				&& !employeeEntity.getEmpPhone().isEmpty()) {
			flag = true;
			System.out.println("Employee phone is Valid");

		} else {
			flag = false;
			System.out.println("Employe phone is Invalid");
			map.put(5, "please enter employee phone no");
			return flag;
		}

		if (employeeEntity.getEmpDate() != null && !employeeEntity.getEmpDate().isBlank()
				&& !employeeEntity.getEmpDate().isEmpty()) {
			flag = true;
			System.out.println("Employee Dob is Valid");

		} else {
			flag = false;
			System.out.println("Employe Dob is Invalid");
			map.put(6, "please enter employee dob");
			return flag;
		}

		if (employeeEntity.getEmpAddress() != null && !employeeEntity.getEmpAddress().isBlank()
				&& !employeeEntity.getEmpAddress().isEmpty()) {
			flag = true;
			System.out.println("Employee Address is Valid");

		} else {
			flag = false;
			System.out.println("Employe Address is Invalid");
			map.put(7, "please enter employee current address");
			return flag;
		}

		if (employeeEntity.getEmpFile() != null) {
			flag = true;
			System.out.println("Employee File is Valid");

		} else {
			flag = false;
			System.out.println("Employe File is Invalid");
			map.put(8, "please attach identity proof");
			return flag;
		}

		return flag;
	}

	@Override
	public boolean saveData(EmployeeEntity employeeEntity) {
		employeeRepo.save(employeeEntity);
		return true;
	}

	@Override
	public boolean updateEmployeById(EmployeeEntity employeeEntity) {
		System.out.println("updateEmployeById() Invoked");

		return this.employeeDAO.updateEmployee(employeeEntity);
	}

	@Override
	public EmployeeEntity getFile(int filId) {
	
		return employeeRepo.getById(filId);
	}



}
