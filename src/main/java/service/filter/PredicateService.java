package service.filter;

import entity.Employee;

public interface PredicateService<T> {

	public boolean predicate(Employee emp);
}
