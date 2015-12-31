
package offices;

public class Premium extends AbstractOffice {
	String houers;
	String poolsize;
	public static int PremiumCounter = 0;

	public Premium(String name, String type, String Address, String houers, String poolsize) {
		super(name, type, Address);
		this.houers = houers;
		this.poolsize = poolsize;
		PremiumCounter += 1;

	}

	public String getHouers() {
		return houers;
	}

	public void setHouers(String houers) {
		this.houers = houers;
	}

	public String getPoolsize() {
		return poolsize;
	}

	public void setPoolsize(String poolsize) {
		this.poolsize = poolsize;
	}

}
