package inheritance;

public class UseBike {
	public static void main(String args[]) {
		Mountainbike M= new Mountainbike("BMW","V6",80,10);
		System.out.println(M);
		
	}

}

class Mountainbike extends Bike {
	private int climbingspeed;
	private int weight;
	
	public Mountainbike(String brand,String model,int climbingspeed,int weight) {
		super(brand,model);
		this.climbingspeed=climbingspeed;
		this.weight=weight;
	}
	public String toString() {
		return super.toString()+" "+climbingspeed+" "+weight;
	
	
}
}


class Bike {
	private String brand;
	private String model;
	public Bike(String brand,String model) {
		this.brand=brand;
		this.model=model;
	}
	public String toString() {
	return brand+" "+model;
}
}
