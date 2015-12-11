package people;

public class Clients extends AbstractPeople {
	int MemberType ;
	
	public Clients( String name , String id ,String phone,int MemberType ) {
	super(name,id,phone);
	this.MemberType = MemberType;
	}
	
	

	public int getMemberType() {
		return MemberType;
	}

	public void setMemberType(int memberType) {
		MemberType = memberType;
	}
	}