package com.blueyonder.team4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.blueyonder.team4.model.Department;
import com.blueyonder.team4.repository.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	DepartmentRepository deptRepo;

	public ResponseEntity<List<Department>> getDepartment() {
		ResponseEntity<List<Department>> deptList=new ResponseEntity<>(deptRepo.findAll(),HttpStatus.OK);
		return deptList;
	}

	public ResponseEntity<List<Department>> getDepartmentById(int id) {
		ResponseEntity<List<Department>> deptList=new ResponseEntity<>(deptRepo.findByDepartmentId(id),HttpStatus.OK);
		return deptList;
	}
}
