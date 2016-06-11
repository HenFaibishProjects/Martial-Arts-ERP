package people;

public class employees implements Person, WorkingDays{
	private final char[] WorkingDays;
	private final int SuplyCode;
	private final String name;
	private final String id;
	private final String phone;

	

	public employees(char[] workingDays, int suplyCode, String name, String id, String phone) {
		WorkingDays = workingDays;
		SuplyCode = suplyCode;
		this.name = name;
		this.id = id;
		this.phone = phone;
	}

	public int getSuplyCode() {
		return SuplyCode;
	}

	public String getName() {
		return this.name;
	}

	public String getId() {
		return this.id;
	}

	public String getPhone() {
		return this.phone;
	}

	public char[] getWorkingDays() {		
		return this.WorkingDays;
	}

	}


