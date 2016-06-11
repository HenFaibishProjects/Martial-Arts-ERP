package datalayer;

import people.employees;

public interface employeeDao {
	employees read(String id);
	
	void save(employees emp);

}
