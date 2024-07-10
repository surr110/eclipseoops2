 package inheritance;
//Method Overloading;
 
public class UseFindmax {
	public static void main(String args[]) {
		Findmax f= new Findmax();
		System.out.println(f.max(100, 151));
		System.out.println(f.max("chennai","Superkings"));
		
		
	}

}
class Findmax {
	public int max(int a,int b) {
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
	}
	public String max(String a,String b) {
		if(a.length()>b.length()) {
			return a;
		}
		else {
			return b;
		}
		
	}
}