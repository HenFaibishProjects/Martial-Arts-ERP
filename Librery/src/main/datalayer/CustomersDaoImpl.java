package datalayer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import people.Customers;

public class CustomersDaoImpl implements CustomersDao {
	
	private final List<Customers> Customers = new ArrayList<Customers>();

	public Customers read(final String id) {
		return Customers.stream().filter(new Predicate<Customers>() {
			public boolean test(Customers customers) {
				return customers.getId().equals(id);
			}
		}).findAny().get();
	}

	public void save(Customers customers) {
		Customers.add(customers);
		
		
	}



}
