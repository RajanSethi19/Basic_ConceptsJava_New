package basics.addition;

public class Call_Static_Method {

	static void add() {
		int a = 10;
		int b = 20;
		int sum;

		sum = a + b;
		System.out.println(sum);
	}

	static void div() {
		int a = 10;
		int b = 20;
		int divd;

		divd = b / a;
		System.out.println(divd);
	}

	static void sub() {
		int a = 10;
		int b = 20;
		int subt;
		subt = b - a;
		System.out.println(subt);
	}

	static void mul() {
		int a = 10;
		int b = 20;
		int mult;

		mult = a * b;
		System.out.println(mult);
	}

	public static void main(String[] args) {

		add();
		sub();
		mul();
		div();

	}

}
