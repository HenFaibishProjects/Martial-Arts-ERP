package people;

final class VirtualSupplier extends Supplier implements Person, WorkingDays{

	int OwnershipType;
	public static int VirtualSupliersCounter;

	
	public VirtualSupplier(char[] workingDays, int suplyCode, String name, String id, String phone, int OwnershipType) {
		super(workingDays, suplyCode, name, id, phone);
		this.OwnershipType = OwnershipType;
 		VirtualSupliersCounter += 1;

	}
}
