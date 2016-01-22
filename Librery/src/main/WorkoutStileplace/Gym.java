package WorkoutStileplace;

public class Gym {
	int id;
	String name;
	String type;
	String Address;
	MATypes WorkoutType;
	

	public Gym(int id ,String name, String type, String Address,MATypes WorkoutType) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.Address = Address;
        this.WorkoutType = WorkoutType;
	}

	public String getName() {
		return name;
	}

	public MATypes getWorkoutType() {
		return WorkoutType;
	}

	public void setWorkoutType(MATypes workoutType) {
		WorkoutType = workoutType;
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
