package com.blueyonder.team4.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.blueyonder.team4.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Integer> {

	@Query(value="select * from department where dept_id=:id",nativeQuery=true)
	List<Department> findByDepartmentId(int id);
	
}
