package com.example.fileupload.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


public interface DocumentService {

	String saveUploadFile(MultipartFile file);

}
