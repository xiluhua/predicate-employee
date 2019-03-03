package service.filter.impl;

import entity.Employee;
import service.filter.PredicateService;

public class PredicateImpl_gender implements PredicateService<Employee> {

	public boolean predicate(Employee emp){
		if (emp.getGender() == 1) {
			return true;
		}
		
		return false;
	}
	
}
