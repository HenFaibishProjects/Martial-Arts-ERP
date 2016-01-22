package people.Action;

import java.util.HashMap;

public class WorkoutPrograms {

	public String aaa(double weight, double high, int age, char gender, String PlanA, String PlanB, String PlanC) {

		HashMap <Integer,String > cache = new HashMap<Integer,String>();
		
		cache.put(1, PlanA);
		cache.put(2, PlanB);
		cache.put(3, PlanC);
		
		
		double sr = (weight + high) / age;
		if (sr > 33) {
			return PlanA;
		} else if (sr > 67) {
			return PlanB;
		}
		return PlanC;

		
		
		
	}
}
