package com.spboot.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spboot.test.entity.FileInfo;
import com.spboot.test.service.FileService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class FileController {
	
	@Autowired
	private FileService fileService; 
	
	@PostMapping("/file-info")
	public String upload(@ModelAttribute FileInfo fi) {
		log.info("@Slf4j어노테이션 이 있으면 log변수 자동으로 만들어줌");
		fi = fileService.saveFileInfo(fi);
		log.info("fi=>{}",fi);
		return "views/file-upload";
	}

	@GetMapping("/file-infos")
	public @ResponseBody List<FileInfo> getFileInfos(@ModelAttribute FileInfo fileInfo){
		log.info("fileInfo=>{}",fileInfo);
		return fileService.getFileInfos(fileInfo);
	}
	@GetMapping("/file-info")
	public @ResponseBody FileInfo getFileInfos(@RequestParam Long fiiNum){
		return fileService.getFileInfo(fiiNum);
	}
}
