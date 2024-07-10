package inheritance;

public class UseHuman {
	public static void main(String args[]) {
		Teacher t1=new Teacher();
		t1.name="Modi";
		t1.country="India";
		t1.isMale=true;
		t1.age=60;
		
		float val=t1.temperature(26.7f);
		
		System.out.println(t1.name+ " "+t1.country);
		
		System.out.println(val);
		
		
	}

}

// Parent

class Human {
	String name;
	String country;
	//method
	public float temperature(float t) {
		return t;
	}
}
// Child

class Teacher extends Human {
	boolean isMale;
	int age;
}
