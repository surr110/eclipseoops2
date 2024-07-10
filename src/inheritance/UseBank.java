package inheritance;
//Method overriding;
public class UseBank {
	public static void main(String args[]) {
		AxisBank A = new AxisBank();
		System.out.println(A.netinterest(10000));
	}

}

//child

class AxisBank extends Bank {
	public int netinterest(int a) {
		return a + ((a / 100) * 20);
	}
}

//parent

class Bank {
	public int netinterest(int n) {
		return n + ((n / 100) * 10);

	}
}
