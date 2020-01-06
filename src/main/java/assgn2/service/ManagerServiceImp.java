package assgn2.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Manager")
public class ManagerServiceImp implements EmployeeService{

	@Override
	public int calculateSalary() {
		return 80000;
	}

}
