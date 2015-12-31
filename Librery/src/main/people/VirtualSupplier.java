package people;

final class VirtualSupplier extends Suppliers {
	int OwnershipType;
	public static int VirtualSupliersCounter;

	public VirtualSupplier(String name, String id, String phone, char[] WorkingDays, int SuplyCode, int OwnershipType) {
		super(name, id, phone, WorkingDays, SuplyCode);
		this.OwnershipType = OwnershipType;
		VirtualSupliersCounter += 1;

	}
}
