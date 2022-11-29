package com.example.fileupload.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.fileupload.entity.Document;
import com.example.fileupload.repository.DocumentRepository;

@Service
public class DocumentServiceImpl implements DocumentService{
	
	@Autowired
	DocumentRepository documentRepository;

	@Override
	public String saveUploadFile(MultipartFile file) {
		String docId=null;
		if (!file.isEmpty()) {
			Document document=new Document();
			document.setDocument_name(file.getOriginalFilename());
			document.setDocument_type(file.getOriginalFilename());
			try {
				document.setFile(file.getBytes());
			} catch (Exception e) {
				e.printStackTrace();
			}
			Document doc=documentRepository.save(document);
			docId=doc.getDocument_id();
		}
		return docId;
	}

}
