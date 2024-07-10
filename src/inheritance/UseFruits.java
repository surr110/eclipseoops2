package inheritance;

//hierarchical inheritance

public class UseFruits {
	public static void main(String args[]) {
		Apple a = new Apple();
		a.country = "india";
		a.origin = "s.america";
		a.colour = "green";
		a.number = 5;
		System.out.println(a.number);

		Banana b = new Banana();
		b.country = "india";
		b.origin = "s.asia";
		b.colour = "red";
		b.type = "small";
		System.out.println(b.country + " " + b.type);

	}

}

class Fruit {
	String country;
	String origin;
}

class Apple extends Fruit {
	String colour;
	int number;

}

class Banana extends Fruit {
	String colour;
	String type;
}
