
public class EjemploGitRemoto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("4-3="+resta(4,3));
		System.out.println("4+3="+suma(4,3));
		System.out.println("4*3="+multiplica(4,3));
		System.out.println(minombrepalcahuticloud());
	}
	
	static int resta (int a, int b) {
		return a-b;
	}
	
	static int suma(int a, int b) {
		return a + b;		
	}
	
	static int multiplica (int a, int b) {
		return a * b;		
	}
	

	static String minombrepalcahuticloud() {
		return "Soy Pedro Alcahut en icloud";
	}
	
	static String eldepedro() {
		return "Cambio en la rama de Pedro";
	}


	static String nombraJavi () {
		return "Espero que no dé fallo";
	}


	static String elDeCarlos() {
		return "Hola me llamo Carlos";
	}

}

