package com.spboot.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spboot.test.entity.CustomerInfo;
import com.spboot.test.service.CustomerInfoService;

@Controller
public class CustomerInfoController {

	@Autowired
	private CustomerInfoService customerInfoService;
	@PostMapping("/login")
	public @ResponseBody CustomerInfo login(@RequestBody CustomerInfo customerInfo) {
		return customerInfoService.login(customerInfo);
	}
}
