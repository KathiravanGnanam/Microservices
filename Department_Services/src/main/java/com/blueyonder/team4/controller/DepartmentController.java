package com.blueyonder.team4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blueyonder.team4.model.Department;
import com.blueyonder.team4.service.DepartmentService;

@RestController
@RequestMapping("/api")
public class DepartmentController {
	
	@Autowired
	DepartmentService deptService;
	
	@GetMapping("/department")
	public ResponseEntity<List<Department>> getDepartment(){
		return deptService.getDepartment();
	}
	@GetMapping("/department/{id}")
	public ResponseEntity<List<Department>> getDepartmentById(@PathVariable("id") int dept_Id){
		return deptService.getDepartmentById(dept_Id);
	}
}
