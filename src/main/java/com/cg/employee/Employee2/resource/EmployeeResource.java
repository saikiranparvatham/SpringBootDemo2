package com.cg.employee.Employee2.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.employee.Employee2.emp.Employee;
import com.cg.employee.Employee2.service.EmployeeService;



@RestController
@RequestMapping("/employees")
public class EmployeeResource {
	@Autowired
	private EmployeeService service;
	
	@PostMapping
	public void addNewEmployee(@RequestBody Employee employee) {
		service.addNewEmployee(employee);
	}
	
	@GetMapping	
	public List<Employee> getAllEmployees()	{
	return service.getAllEmployees();
	}
	
	@PutMapping
	public void updateEmployee(@RequestBody Employee employee)
	{
		service.updateEmployee(employee);
	}
	
	@DeleteMapping("/{empId}")
	public void updateEmployee(@PathVariable int empId)
	{
		service.deleteEmployee(empId);
	}
	
	@GetMapping("/{empId}")
	Optional<Employee> one(@PathVariable int empId) {

		return service.findById(empId);
			
	}
	
	
}
