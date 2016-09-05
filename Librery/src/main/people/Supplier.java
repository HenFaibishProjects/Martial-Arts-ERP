package people;

import people.InterFaces.Person;
import people.InterFaces.WorkingDays;

public class Supplier implements Person, WorkingDays{
	private final char[] WorkingDays;
	private final int SuplyCode;
	private String name;
	private String id;
	private String phone;

	

	public Supplier(char[] workingDays, int suplyCode, String name, String id, String phone) {
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

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;

	}

	public void setPhone(String phone) {
		this.phone = phone;

	}

}
