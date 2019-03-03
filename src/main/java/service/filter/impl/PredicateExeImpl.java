package service.filter.impl;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import entity.Employee;
import service.filter.PredicateExeService;
import service.filter.PredicateService;

public class PredicateExeImpl implements PredicateExeService {
	
	@Override
	public Set<Employee> exe(List<Employee> list, PredicateService<Employee> service) {
		Set<Employee> employees = new HashSet<>();
        // 需求1：取出年龄大于30的员工
        for (Employee employee : list) {
			if (service.predicate(employee)) {
				employees.add(employee);
			}
		}
		return employees;
	}

}
