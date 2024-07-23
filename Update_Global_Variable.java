package basics.addition;

public class Update_Global_Variable {

	int a = 10;
	static String name = "Rajan";

	public static void main(String[] args) {

		System.out.println(name);
		name = "Sethi"; // global static variable value updated
		System.out.println(name);

		Update_Global_Variable uv = new Update_Global_Variable();
		System.out.println(uv.a);
		System.out.println(uv.a = 20);

	}

}
