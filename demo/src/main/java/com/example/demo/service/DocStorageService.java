package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entity.Doc;
import com.example.demo.repository.DocDAO;
import com.example.demo.repository.DocRepository;

@Service
public class DocStorageService {

	@Autowired
	private DocRepository docRepository;
	
	@Autowired
	private DocDAO dao;
	
//	@Autowired
//	private Doc doc;

	public Doc  saveFile(MultipartFile file,Doc doc) {
		String docName=file.getOriginalFilename();
		try {
//			Doc doc=new Doc(docName,file.getContentType(),file.getBytes());
			Doc doc1=new Doc(doc.getEmpName(), doc.getEmpCourse(), doc.getEmpGender(), doc.getEmpMail(), doc.getEmpPhone(), doc.getEmpDate(), doc.getEmpAddress(), docName, file.getContentType(), file.getBytes());
			return docRepository.save(doc1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public Optional<Doc> getFile(Integer fileId) {
		return docRepository.findById(fileId);
	}

	public List<Doc> getFiles() {
		return docRepository.findAll();
	}

	public Doc updateEmployeById(MultipartFile file,Doc doc) {

		String docName=file.getOriginalFilename();
		try {
//			Doc doc=new Doc(docName,file.getContentType(),file.getBytes());
			Doc doc1=new Doc(doc.getEmpName(), doc.getEmpCourse(), doc.getEmpGender(), doc.getEmpMail(), doc.getEmpPhone(), doc.getEmpDate(), doc.getEmpAddress(), docName, file.getContentType(), file.getBytes());
//			return docRepository.save(doc1);
		return dao.updateEmployee(doc1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
