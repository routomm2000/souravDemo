package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.DemoService;

@RestController
@RequestMapping("demo1")
public class DemoController {
	
	@Autowired
	private DemoService DemoService;
		public String m1(){
		return DemoService.m1();
	}
}
