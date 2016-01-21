package people;

public class Trainers extends AbstractPeople {
	String title;
	int years;
	public static int EmployeeCounter = 0;

	public Trainers(String name, String id, String phone, String title, int years) {
		super(name, id, phone);
		this.title = title;
		this.years = years;
		EmployeeCounter += 1;

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

}
