package com.example.fileupload.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fileupload.entity.Document;

@Repository
public interface DocumentRepository extends JpaRepository<Document, String>{

}
