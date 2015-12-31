package offices;

public abstract class AbstractOffice {
	String name;
	String type;
	String Address;

	public AbstractOffice(String name, String type, String Address) {
		this.name = name;
		this.type = type;
		this.Address = Address;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

}
