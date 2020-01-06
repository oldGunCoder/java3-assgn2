/* Assignment 2
 * 
 * Create a bean (Employee)
 * Create an interface EmployeeService. It has one method (calculateSalary)
 * Create 2 implementations (ManagerService and ClerkService) that implements EmployeeService.
 * Inject EmployeeService into Employee.
 * Use annotation to configure the beans.
 * Calculate the salary of the 2 employees in the app.java class. 
 * 
 * ANNOTATION USED
 */

package assgn2.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import assgn2.model.Employee;


public class App {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		// Scan beans
		context.scan("assgn2.model");
		context.scan("assgn2.service");
		context.refresh();


		Employee e = context.getBean(Employee.class);
		
		System.out.println("The total salary of the manager plus the clerk is: " + (e.getClerkSalary()+e.getManagerSalary()));

		context.close();
	}
}
