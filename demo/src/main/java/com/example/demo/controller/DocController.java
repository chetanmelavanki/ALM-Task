package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entity.Doc;
import com.example.demo.repository.DocRepository;
import com.example.demo.service.DocStorageService;

@Controller
public class DocController {

	@Autowired
	private DocStorageService docStorageService;
	
	@Autowired
	private DocRepository docRepository;
	
	public DocController() {
		System.out.println("DocController()");
	}
	
	@GetMapping("/")
	public String get(Model model) {
		List<Doc> docs=docStorageService.getFiles();
		model.addAttribute("docs", docs);
		return "doc";
	}
	
	@PostMapping("/uploadFiles")
	public String uploadMultipleFiles(@RequestParam("files") MultipartFile[] files,Doc doc) {
		for(MultipartFile file:files) {
			docStorageService.saveFile(file,doc);
		}
		return "fetch";
	}
	
	@GetMapping("downloadFile/{fileId}")
	public ResponseEntity<ByteArrayResource> downloadFile(@PathVariable Integer fileId){
		Doc doc=docStorageService.getFile(fileId).get();
		return ResponseEntity.ok()
				.contentType(MediaType.parseMediaType(doc.getDocType()))
				.header(HttpHeaders.CONTENT_DISPOSITION,"attachment:filename=\""+doc.getDocName())
				.body(new ByteArrayResource(doc.getData()));
	}
	
	@RequestMapping("/getEmployee")
	public String getEmployee(@RequestParam int empId,Model model) {
		List<Doc> docs=docStorageService.getFiles();
		model.addAttribute("docs", docs);
		Doc doc=docRepository.findById(empId).get();
		return "fetch";
	}
	
	@RequestMapping("/deleteEmployeById")
	public String deleteEmployeById(@RequestParam int empId,Model model) {
		docRepository.deleteById(empId);
		model.addAttribute("dltEmp", "deleted empoyee details successfully");
		return "fetch";
	}
	
	@RequestMapping("/updateEmployeeByEmpId")
	public String updateEmployeeByEmpId(@RequestParam("files") MultipartFile[] files,@ModelAttribute Doc doc) {
		System.out.println("updateEmployeeByEmpId() Invoked");
		for(MultipartFile file:files) {
//			docStorageService.saveFile(file,doc);
			 this.docStorageService.updateEmployeById(file,doc);
		}
		
		return "fetch";
	}
	
	
}
