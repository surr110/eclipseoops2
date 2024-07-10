package inheritance;

public class Usecar {
public static void main(String args[]) {
	SportsCar s= new SportsCar("BMW",70000,123.4f,120);
	System.out.println(s);
	
}
}
class SportsCar extends Car {
	private  float weight;
	private int speed;
	public SportsCar(String name,int price,float weight,int speed) {
		super(name,price);		
		this.weight=weight;
		this.speed=speed;
		
	}
	public String toString() {
		return " "+weight+" "+speed+super.toString();
		//based on required output to string can be added at front or back
	}
	
}



class Car{
	private String name;
	private int price;
	public Car(String name,int price) {
		this.name=name;
		this.price=price;
		
	}
	public String toString() {
		return name+" "+price;
	}
}
