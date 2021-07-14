package com.example.workflow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.workflow.service.CamundaService;

@RestController
@RequestMapping("/api")
public class CamundaController {
	
	@Autowired
	CamundaService service;
	
	@GetMapping("/process-instance/{processKey}")
	public Object getCamunda(@PathVariable String processKey) {
	return service.triggerProcess(processKey);
	}
	
	@GetMapping("/process-instance/getEmployee/{varName}")
	public String getEmployee(@PathVariable String varName) {
	return service.getEmployee(varName);
	}
	
	
}
