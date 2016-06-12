package datalayer;

import people.Supplier;

public interface SuplierDao {
	Supplier read(String id);
	
	void save(Supplier supplier);

}
