package com.cg.employee.Employee2.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.employee.Employee2.emp.Employee;
import com.cg.employee.Employee2.repo.EmployeeRepository;



@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	 EmployeeRepository repository;

	@Override
	public void addNewEmployee(Employee employee) {
		repository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return repository.findAll();
	}

	@Override
	public void updateEmployee(Employee employee) {
		repository.save(employee);
		
	}

	@Override
	public void deleteEmployee(int empId) {
		Employee employee = repository.getOne(empId);
		repository.delete(employee);
		
	}

	@Override
	public Optional<Employee> findById(int empId) {
		
		return repository.findById(empId);
	}

}