package service.filter;

import java.util.List;
import java.util.Set;

import entity.Employee;

public interface PredicateExeService {
	Set<Employee> exe(List<Employee> list, PredicateService<Employee> service);
}
