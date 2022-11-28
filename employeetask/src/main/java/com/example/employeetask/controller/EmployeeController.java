package com.example.employeetask.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.Document;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.employeetask.dao.EmployeeRepo;
import com.example.employeetask.entity.EmployeeEntity;
import com.example.employeetask.service.EmployeeService;
import com.example.employeetask.service.EmployeeServiceimpl;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@Autowired
	private EmployeeRepo employeeRepo;
	

	public EmployeeController() {
		System.out.println("EmployeeController() Invoked");
	}

	@RequestMapping("")
	public String getHomePage() {
		System.out.println("getHomePage() Invoked");
		return "home";
	}

	@RequestMapping("/addEmployee")
	public String addEmployee(@ModelAttribute EmployeeEntity employeeEntity, Model model) {

		System.out.println("addEmployee() Invoked");

		System.out.println("Employee Name:" + employeeEntity.getEmpName());
		System.out.println("Employee Course:" + employeeEntity.getEmpCourse());
		System.out.println("Employee Gender:" + employeeEntity.getEmpGender());
		System.out.println("Employee Email:" + employeeEntity.getEmpMail());
		System.out.println("Employee Phoneno:" + employeeEntity.getEmpPhone());
		System.out.println("Employee Dob:" + employeeEntity.getEmpDate());
		System.out.println("Employee Address:" + employeeEntity.getEmpAddress());
		System.out.println("Employee File:" + employeeEntity.getEmpFile());

		boolean isEmployeeValid = this.employeeService.validateEmployee(employeeEntity);

		if (isEmployeeValid == true) {
			boolean isSaved = this.employeeService.saveData(employeeEntity);
			if (isSaved == true) {
				System.out.println("Employee detials saved to db");
				model.addAttribute("eSave", "Submitted successfully");
				return "fetch";
			} else {
				System.out.println("Employee detials is not saved to db");
			}
		} else {
			System.out.println("Employee details is invalid");
			Map<Integer, String> map = EmployeeServiceimpl.map;
			model.addAttribute("errName", map.get(1));
			model.addAttribute("errCource", map.get(2));
			model.addAttribute("errGender", map.get(3));
			model.addAttribute("errMail", map.get(4));
			model.addAttribute("errPhone", map.get(5));
			model.addAttribute("errDob", map.get(6));
			model.addAttribute("errAddress", map.get(7));
			model.addAttribute("errFile", map.get(8));
		}
		return "home";
	}

	@RequestMapping("/getEmployee")
	public String getEmployee(@RequestParam int empId, Model model) {
		System.out.println("getEmployee() invoked");
		EmployeeEntity employeeEntity = employeeRepo.findById(empId).get();

		model.addAttribute("empName", employeeEntity.getEmpName());
		model.addAttribute("empCourse", employeeEntity.getEmpCourse());
		model.addAttribute("empGender", employeeEntity.getEmpGender());
		model.addAttribute("empEmail", employeeEntity.getEmpMail());
		model.addAttribute("empPhone", employeeEntity.getEmpPhone());
		model.addAttribute("empDob", employeeEntity.getEmpDate());
		model.addAttribute("empAddress", employeeEntity.getEmpAddress());
		model.addAttribute("empFile", employeeEntity.getEmpFile());
//		System.out.println(employeeEntity.getEmpFile());

		return "fetch";
	
	}

	@RequestMapping("/deleteEmployeById")
	public String deleteEmployeById(@RequestParam int dltEmpId, Model model) {
		System.out.println("deleteEmployeById() invoked");
		employeeRepo.deleteById(dltEmpId);
		model.addAttribute("empDelete", "entered employe id " + dltEmpId + " deleted successfully");
		return "fetch";
	}

	@RequestMapping("/updateEmployeeByEmpId")
	public String updateEmployeeByEmpId(@ModelAttribute EmployeeEntity employeeEntity, Model model) {
		System.out.println("updateEmployeeByEmpId() Invoked");
		
		boolean isEmpUpdated = this.employeeService.updateEmployeById(employeeEntity);
		if (isEmpUpdated) {
			System.out.println("update employee entity...Thank you");
			model.addAttribute("updateEmp", "update employee entity...Thank you");
		} else {
			System.out.println("Employee entity is not updated");
			model.addAttribute("updateEmp", "Employee entity is not updated");
		}
		return "fetch";
	}
	
	@RequestMapping("/download_document")
	public void downloadFile(HttpServletResponse httpServletResponse) throws IOException {
		System.out.println("downloadFile() Invoked");
		int id=1;
		EmployeeEntity employeeEntity=employeeRepo.findById(id).get();
		
		httpServletResponse.setContentType("application/octet-stream");
//		String headerKey="Content-Desposition";
//		String headerValue="attachment; filename="+employeeEntity.getEmpFileName();
//		
//		httpServletResponse.setHeader(headerKey, headerValue);
		ServletOutputStream outputStream=httpServletResponse.getOutputStream();
		outputStream.write(employeeEntity.getEmpFile());
	}

}
