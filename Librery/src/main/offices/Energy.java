package offices;

public class Energy extends AbstractOffice {
	String houers;
	public static int EnergyCounter = 0;

	public Energy(String name, String type, String Address, String houers) {
		super(name, type, Address);
		this.houers = houers;
		EnergyCounter += 1;

	}

	public String getHouers() {
		return houers;
	}

	public void setHouers(String houers) {
		this.houers = houers;
	}

}
