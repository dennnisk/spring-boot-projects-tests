package com.example.sbbackendangular.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.sbbackendangular.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	@Query("select max(id) from Employee") 
	Integer getLastEmployee();
	
	@Override
	default <S extends Employee> S save(S entity) {
		if (entity.getId() == null) {
			Integer lastId = getLastEmployee();
			if (lastId == null) {
				entity.setId(1);
			} else {
				entity.setId(lastId+1);
			}
		}
		
		this.saveAndFlush(entity);
		
		return entity;
	}
	
}
