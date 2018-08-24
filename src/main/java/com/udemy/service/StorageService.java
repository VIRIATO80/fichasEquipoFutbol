package com.udemy.service;

import org.springframework.web.multipart.MultipartFile;

public interface StorageService {
	public void store(MultipartFile file, int id);
}
