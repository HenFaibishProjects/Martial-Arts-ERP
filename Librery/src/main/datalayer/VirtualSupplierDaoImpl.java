package datalayer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import people.VirtualSupplier;

public class VirtualSupplierDaoImpl implements VirtualSupplierDao{
	
	private final List<VirtualSupplier> vsuppliers = new ArrayList<VirtualSupplier>();

	public VirtualSupplier read(final String id) {
		return vsuppliers.stream().filter(new Predicate<VirtualSupplier>() {
			public boolean test(VirtualSupplier vsupp) {
				return vsupp.getId().equals(id);
			}
		}).findAny().get();
	}

	public void addnewVsupp(VirtualSupplier vsupplier) {
		vsuppliers.add(vsupplier);
		
		
	}

	public void deleteVsupp(VirtualSupplier virtualsupplier) {
		    int index = vsuppliers.indexOf(virtualsupplier);
			vsuppliers.remove(index);
		
	}



}
