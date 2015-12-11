package offices;

public class Energy extends AbstractOffice {
	String houers; 
	
	public Energy(String name, String type, String Address, String houers) {
		super(name, type, Address);
		this.houers = houers;
		
	}

	public String getHouers() {
		return houers;
	}

	public void setHouers(String houers) {
		this.houers = houers;
	}


	 
	
}
