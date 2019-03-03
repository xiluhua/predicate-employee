package service.filter.impl;

import entity.Employee;
import service.filter.PredicateService;

public class PredicateImpl_age implements PredicateService<Employee> {
	
	public boolean predicate(Employee emp){
		if (emp.getAge() > 30) {
			return true;
		}
		
		return false;
	}

}
