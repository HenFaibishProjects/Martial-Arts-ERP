package datalayer;

import people.Customers;

public interface CustomersDao {
	Customers read(String id);
	
	void save(Customers customers);

}
