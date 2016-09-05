package datalayer;

import people.VirtualSupplier;

public interface VirtualSupplierDao {


	    VirtualSupplier read(String id);
		
		void addnewVsupp(VirtualSupplier virtualsupplier);
		void deleteVsupp(VirtualSupplier virtualsupplier);
		
		
		
		/*  modification : TO BE DEFINED
		void ModifyWorkingDays(VirtualSupplier virtualsupplier);
		
		void ModifySuplyCode(VirtualSupplier virtualsupplier);	
		
		void ModifyName(VirtualSupplier virtualsupplier);
		
		void ModifyId(VirtualSupplier virtualsupplier);
		
		void ModifyPhone(VirtualSupplier virtualsupplier);
		
		void ModifyOwnershipType(VirtualSupplier virtualsupplier);
		
		
        */
		
		

	}


