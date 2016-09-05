package people;

import people.InterFaces.CustomerAction;
import people.InterFaces.Person;
import people.InterFaces.WorkingDays;

public final class VirtualSupplier extends Supplier implements Person, CustomerAction{  

	int OwnershipType;
	public static int VirtualSupliersCounter;

	
	public VirtualSupplier(char[] workingDays, int suplyCode, String name, String id, String phone, int OwnershipType) {
		super(workingDays, suplyCode, name, id, phone);
		this.OwnershipType = OwnershipType;
 		VirtualSupliersCounter += 1;

	}


	@Override
	public double CalcBMI(double weight, double height) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public String CalcHeartBit(double age) {
		// TODO Auto-generated method stub
		return null;
	}
}
