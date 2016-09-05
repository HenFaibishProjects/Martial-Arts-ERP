package datalayer;

import people.Supplier;

public interface SuplierDao {
	Supplier read(String id);
	
	void save(Supplier supplier);
	
	
	/*  modification : TO BE DEFINED
	 * 
	void ModifyWorkingDays(VirtualSupplier virtualsupplier);
	
	void ModifySuplyCode(VirtualSupplier virtualsupplier);	
	
	void ModifyName(VirtualSupplier virtualsupplier);
	
	void ModifyId(VirtualSupplier virtualsupplier);
	
	void ModifyPhone(VirtualSupplier virtualsupplier);
	
	
	
    */

}
