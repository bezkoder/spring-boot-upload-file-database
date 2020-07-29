package com.bezkoder.spring.files.upload.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bezkoder.spring.files.upload.db.model.FileDB;

@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String> {

}
