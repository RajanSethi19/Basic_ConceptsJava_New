package basics.addition;

public class Global_Variable_Usage_InMethods {
	int a = 10;
	int b = 20;
	int sum, sub, div, mod, mul;

	void add() {

		sum = a + b;
		System.out.println(sum);
	}

	void subtract() {

		sub = a - b;
		System.out.println(sub);
	}

	void multiply() {

		mul = a * b;
		System.out.println(mul);
	}

	void divide() {

		div = b / a;
		System.out.println(div);
	}

	void modulas() {

		mod = b % a;
		System.out.println(mod);
	}

	public static void main(String[] args) {
		Global_Variable_Usage_InMethods g = new Global_Variable_Usage_InMethods();
		g.add();
		g.divide();
		g.multiply();
		g.subtract();
		g.modulas();

	}

}
