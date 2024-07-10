package inheritance;
//multilevel
public class UseEngineer {
	public static void main(String args[]) {
		SoftwareEngineer S= new SoftwareEngineer();
		S.name="Raja";
		S.country="USA";
		S.college="Yale";
		S.year=2023;
		S.company="Google";
		S.position="TL";
		S.salary=5000000;
		System.out.println(S.salary);
		
	}

}
//Grandfather
class Humans1{
	String name;
	String country;
	}
//Father
class Engineer extends Humans1{
	String college;
	int year;
}
//Child
class SoftwareEngineer extends Engineer{
	String company;
	String position;
	int salary;
}
