package WorkoutStileplace;

public class RoomOnGym extends Gym {
	int roomNumber;
	String description;

	public RoomOnGym(int id, String name, String type, String Address, MATypes WorkoutType,int roomNumber,String description) {
		super(id, name, type, Address, WorkoutType);
		this.roomNumber = roomNumber;
		this.description = description;
		
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	
	
}
