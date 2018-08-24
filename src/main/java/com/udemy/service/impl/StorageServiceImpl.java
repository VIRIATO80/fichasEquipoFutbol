package com.udemy.service.impl;

import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.apache.commons.io.FilenameUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.udemy.service.StorageService;

@Service("storageServiceImpl")
public class StorageServiceImpl implements StorageService {

	private final Path rootLocation = Paths.get("src/main/resources/static/imgs/");
	
	@Override
	public void store(MultipartFile file, int id) {

		try {			
	        Files.createDirectories(rootLocation);
	        try{	        	
	        	String nuevoNombre = file.getOriginalFilename().replace(file.getOriginalFilename(), FilenameUtils.getBaseName(id + "." + FilenameUtils.getExtension(file.getOriginalFilename())).toLowerCase());	        		        	
	        	Files.copy(file.getInputStream(), rootLocation.resolve(nuevoNombre+".jpg"), StandardCopyOption.REPLACE_EXISTING);
	        }catch(FileAlreadyExistsException ex){
	        	System.out.println("Imagen ya existe");
	        }
        } catch (Exception e) {
        	e.printStackTrace();
        }
			
	}

}
