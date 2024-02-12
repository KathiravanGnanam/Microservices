package com.blueyonder.team4.controller;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.blueyonder.team4.DTO.Department;

@RestController
@RequestMapping("/microservice")
public class MicroserviceController {
	
	@GetMapping("/displayDepartment")
	public ResponseEntity<List<Department>> displayDepartment(){
		
		ResponseEntity<List<Department>> response=new RestTemplate().exchange("http://localhost:8081/dept/getdepts",HttpMethod.GET,null,new ParameterizedTypeReference<List<Department>>() {});
		return response;
	}

}
