package AddNewAndChangeExist;

import java.util.ArrayList;
import java.util.List;

import WorkoutStileplace.Gym;
import WorkoutStileplace.MATypes;

public class DealWithGym {
	static List<Gym> gymlist = new ArrayList<Gym>();
	
	public void NewOffice(int id ,String name, String type, String Address,MATypes WorkoutType) {		
		gymlist.add(new Gym(id,name,type,Address,WorkoutType));   
	}

	public int getCategoryPos(int id) {
		return gymlist.indexOf(id)+1;
		
	}

	public  void deleteGym(int id) {
		int index = getCategoryPos(id);
		gymlist.remove(index);
	
	}
	
	
	
	public void ChangeOfficeAddress(int id,Gym address) {
		int index = getCategoryPos(id);
		gymlist.set(index+1, address);

	}

	public void ChangeOfficePhone(int id,Gym type) {
		int index = getCategoryPos(id);
		gymlist.set(index+1, type);
		
		
		
		
		

	}

	public void ChangeOfficeType(int id,Gym WorkoutType) {
		int index = getCategoryPos(id);
		gymlist.set(index+1, WorkoutType);

	}
}