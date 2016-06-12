package datalayer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import people.employees;

public class employeeDaoImpl implements employeeDao {
	
	private final List<employees> employeesl = new ArrayList<employees>();

	public employees read(final String id) {
		return employeesl.stream().filter(new Predicate<employees>() {
			public boolean test(employees emp) {
				return emp.getId().equals(id);
			}
		}).findAny().get();
	}

	public void save(employees emp) {
		employeesl.add(emp);
		
		
	}



}
