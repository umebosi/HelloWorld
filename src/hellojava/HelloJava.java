package hellojava;

public class HelloJava {

	public static void main(String[] args) {

		System.out.println("**** Hello how are you!! ****");

		Hi hi = new Hi();
		hi.howareou();

		fuga();

		guoo();

		zooo();

		zzzz();

		ByeBug bg = new ByeBug();
		bg.bugg();
		bg.byee();

		hoge();

		heke();

		System.out.println("**** Bye bye! ****");
	}

	private static void fuga() {

		System.out.println("**** Fuga fuga! ****");
	}

	private static void guoo() {

		System.out.println("**** Guoo oooo! ****");
	}

	private static void zooo() {

		System.out.println("**** Zooo oooo! ****");
	}

	private static void zzzz() {

		System.out.println("**** Zzzz zzzz! ****");
	}

	private static void hoge() {

		System.out.println("**** Hoge eeee! ****");
	}

	private static void heke() {

		System.out.println("**** Heke keke! ****");
	}

}
