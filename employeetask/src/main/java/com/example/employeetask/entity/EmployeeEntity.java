package com.example.employeetask.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "employee_table")
@NamedQuery(name = "EmployeeEntity.updateEmployeeByEmpId", query = "update EmployeeEntity set empName=:NAME,empCourse=:COURSE,empGender=:GENDER,empMail=:MAIL,empPhone=:PHONE,empDate=:DATE,empAddress=:ADDRESS,empFile=:FILE")
public class EmployeeEntity {

	@Id
	@GenericGenerator(name = "x", strategy = "increment")
	@GeneratedValue(generator = "x")
	private int empId;
	private String empName;
	private String empCourse;
	private String empGender;
	private String empMail;
	private String empPhone;
	private String empDate;
	private String empAddress;
	@Lob
	private byte[] empFile;

	public EmployeeEntity() {
		System.out.println("EmployeeEntity() Invoked");
	}

	public EmployeeEntity(byte[] empFile) {
		super();
		this.empFile = empFile;
	}


	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpCourse() {
		return empCourse;
	}

	public void setEmpCourse(String empCourse) {
		this.empCourse = empCourse;
	}

	public String getEmpGender() {
		return empGender;
	}

	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}

	public String getEmpMail() {
		return empMail;
	}

	public void setEmpMail(String empMail) {
		this.empMail = empMail;
	}

	public String getEmpPhone() {
		return empPhone;
	}

	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}

	public String getEmpDate() {
		return empDate;
	}

	public void setEmpDate(String empDate) {
		this.empDate = empDate;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public byte[] getEmpFile() {
		return empFile;
	}

	public void setEmpFile(byte[] empFile) {
		this.empFile = empFile;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [empId=" + empId + ", empName=" + empName + ", empCourse=" + empCourse + ", empGender="
				+ empGender + ", empMail=" + empMail + ", empPhone=" + empPhone + ", empDate=" + empDate
				+ ", empAddress=" + empAddress + ", empFile=" + empFile + "]";
	}

}
