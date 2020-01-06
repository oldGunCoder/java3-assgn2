package assgn2.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import assgn2.service.EmployeeService;

@Component
public class Employee {
	
	//values
	@Autowired
	@Qualifier("Manager")
	EmployeeService managerService;
	
	@Autowired
	@Qualifier("Clerk")
	EmployeeService clerkService;
	
	
	//constructors
	public Employee() {
	}
		
	//methods
	public int getManagerSalary() {
		return managerService.calculateSalary();
	}
	public int getClerkSalary() {
		return clerkService.calculateSalary();
	}
}
