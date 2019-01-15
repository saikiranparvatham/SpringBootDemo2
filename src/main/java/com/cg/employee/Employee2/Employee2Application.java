package com.cg.employee.Employee2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cg.employee.Employee2.emp.Address;
import com.cg.employee.Employee2.emp.Employee;
import com.cg.employee.Employee2.repo.EmployeeRepository;

@SpringBootApplication
public class Employee2Application {

	public static void main(String[] args) {
		SpringApplication.run(Employee2Application.class, args);
	}
	
	@Bean
	public CommandLineRunner populateData(EmployeeRepository repository)
	{
		
		return (arg) -> {
			repository.save(new Employee(101,"Ramesh",12000,new Address("mumbai", 400007, "Maharashtra")));
			repository.save(new Employee(102,"Suresh",10000,new Address("Hyderabad", 500005, "Telangana")));
			repository.save(new Employee(103,"Kumar",11000,new Address("Banglore", 300004, "Karnataka")));
			repository.save(new Employee(103,"Naresh",11000,new Address("Manglore", 300004, "Karnataka")));
			repository.save(new Employee(103,"Shankar",14000,new Address("Chennai", 300010, "TamilNadu")));
		};
	}
}

