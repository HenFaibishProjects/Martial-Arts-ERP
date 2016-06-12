package datalayer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import people.Supplier;

public class SuplierDaoImpl implements SuplierDao {
	
	private final List<Supplier> suppliers = new ArrayList<Supplier>();

	public Supplier read(final String id) {
		return suppliers.stream().filter(new Predicate<Supplier>() {
			public boolean test(Supplier supp) {
				return supp.getId().equals(id);
			}
		}).findAny().get();
	}

	public void save(Supplier supplier) {
		suppliers.add(supplier);
		
		
	}



}
