package com.example.fileupload.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.fileupload.service.DocumentService;

@Controller
public class DocumentController {

	@Autowired
	DocumentService documentService;
	
	@RequestMapping("")
	public String indexPage() {
		System.out.println("indexPage()");
		
		return "index";
	}
	
//	@PostMapping("/saveFile")
//	public String uploadFile(@RequestParam("file") MultipartFile file,Model map) {
//		System.out.println("uploadFile() invoked");
//		String message="";
//		String documentId="";
//		if(file.isEmpty()) {
//			message="could not upload files";
//		}
//		else {
//			documentId=documentService.saveUploadFile(file);
//			message="uplaod the file successfully: "+file.getOriginalFilename();
//		}
//		String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
//				.path("/downloadFile/")
//				.path(documentId)
//				.toUriString();
//		
//		map.addAttribute("message", message);
//		map.addAttribute("downloadurl", fileDownloadUri);
//		return "success";
//		
//	}
}
