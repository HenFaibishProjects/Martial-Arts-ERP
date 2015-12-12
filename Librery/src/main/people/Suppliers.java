package people;

public class Suppliers extends AbstractPeople {
	char[] WorkingDays ;
	int SuplyCode;
	
	public Suppliers( String name , String id ,String phone,char[] WorkingDays,int SuplyCode ) {
	super(name,id,phone);
	this.WorkingDays = WorkingDays;
	this.SuplyCode  = SuplyCode;		
	
	}

	public char[] getWorkingDays() {
		return WorkingDays;
	}

	public void setWorkingDays(char[] workingDays) {
		WorkingDays = workingDays;
	}

	public int getSuplyCode() {
		return SuplyCode;
	}

	public void setSuplyCode(int suplyCode) {
		SuplyCode = suplyCode;
	}
		
		
	
}
