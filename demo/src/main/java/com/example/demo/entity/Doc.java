package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

//@Component
@Entity
@Table(name = "docs")
@NamedQuery(name = "DOC.updateEmployeeByEmpId", query = "update Doc set empName=:NAME,empCourse=:COURSE,empGender=:GENDER,empMail=:MAIL,empPhone=:PHONE,empDate=:DATE,empAddress=:ADDRESS,docName=:DOCNAME,docType=:DOCTYPE,data=:FILE")
public class Doc {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String empName;
	private String empCourse;
	private String empGender;
	private String empMail;
	private String empPhone;
	private String empDate;
	private String empAddress;
	private String docName;
	private String docType;
	@Lob
	private byte[] data;

	public Doc() {
		System.out.println("Doc() invoked");
	}

//	public Doc(String docName, String docType, byte[] data) {
//		super();
//		this.docName = docName;
//		this.docType = docType;
//		this.data = data;
//	}

	public Doc(String empName, String empCourse, String empGender, String empMail, String empPhone, String empDate,
			String empAddress, String docName, String docType, byte[] data) {
		super();
		this.empName = empName;
		this.empCourse = empCourse;
		this.empGender = empGender;
		this.empMail = empMail;
		this.empPhone = empPhone;
		this.empDate = empDate;
		this.empAddress = empAddress;
		this.docName = docName;
		this.docType = docType;
		this.data = data;
	}

	public Integer getId() {
		return id;
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

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public String getDocType() {
		return docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}

	public void setId(Integer id) {
		this.id = id;
	}

//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	public String getDocName() {
//		return docName;
//	}
//
//	public void setDocName(String docName) {
//		this.docName = docName;
//	}
//
//	public String getDocType() {
//		return docType;
//	}
//
//	public void setDocType(String docType) {
//		this.docType = docType;
//	}
//
//	public byte[] getData() {
//		return data;
//	}
//
//	public void setData(byte[] data) {
//		this.data = data;
//	}

}
