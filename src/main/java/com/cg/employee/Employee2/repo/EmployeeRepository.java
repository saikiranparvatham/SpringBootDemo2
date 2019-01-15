package com.cg.employee.Employee2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cg.employee.Employee2.emp.*;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	
}
