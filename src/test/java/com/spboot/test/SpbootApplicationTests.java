package com.spboot.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spboot.test.repository.CustomerInfoRepository;
import com.spboot.test.repository.FileRepository;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class SpbootApplicationTests {

	@Autowired
	private FileRepository fileRepo;
	
	@Test
	void contextLoads() {
		log.info("fiList=>{}",fileRepo.findAll());
	}

}
