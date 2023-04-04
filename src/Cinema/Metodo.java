package Cinema;

import java.util.Scanner;

public class Metodo {

	public static int generaNumeroEnteroAleatorio(int minimo,int maximo) {
		int num=(int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
			return num;
		
		}
	
	public static double generaNumeroRealAleatorio(int minimo,int maximo) {
		double num=Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
			return num;
		
		}
	
	public static final String nombres[]= {"Marcos","Laura",
			"Pepe", "Ana","Maria","Joaquin","Clara","Mario",
			"Luis","Lorena","Pedro", "Anastacia","Marian","Jose",
			"Claudia","Mercedez","Gabriel","Luisa","Patricio","Angel","Martina",
			"Jorge","Camila","Rebeca","Juan","Karen","kevin", "Angelica",
			"Maritza","Ernesto","Erika","Monica"};
	
	

	static int pideInt(String mensaje) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
			System.out.println(mensaje);
				return input.nextInt();
	}
	
	
	static double pideDouble(String mensaje) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
			System.out.println(mensaje);
				return input.nextDouble();
	}
		
}