package AddNewAndChangeExist;

import java.util.ArrayList;
import java.util.List;

import WorkoutStileplace.Gym;
import WorkoutStileplace.MATypes;
import WorkoutStileplace.RoomOnGym;

public class DealWithRoomsOnGym {
	static List<RoomOnGym> gymroomlist = new ArrayList<RoomOnGym>();
	
	public void NewOffice(int id ,String name, String type, String Address,MATypes WorkoutType,int Roomnumber,String description) {		
		gymroomlist.add(new RoomOnGym(id,name,type,Address,WorkoutType,Roomnumber,description));   
	}

	public int getCategoryPos(int id) {
		return gymroomlist.indexOf(id)+1;
		
	}

	public  void deleteGym(int id) {
		int index = getCategoryPos(id);
		gymroomlist.remove(index);
	
	}
	

	public void ChangeOfficeAddress(int id,RoomOnGym Roomnumber) {
		int index = getCategoryPos(id);
		gymroomlist.set(index+1, Roomnumber);

	}

	public void ChangeOfficePhone(int id,RoomOnGym description) {
		int index = getCategoryPos(id);
		gymroomlist.set(index+1, description);

	}

	public void ChangeOfficeType(int id,Gym WorkoutType) {
		int index = getCategoryPos(id);
		gymroomlist.set(index+1, (RoomOnGym) WorkoutType);

	}
}