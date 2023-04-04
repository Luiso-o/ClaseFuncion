package Cinema;

public class Simulacion_secion {

	public static void main(String[] args) {
	
		  //Creo la pelicula
        Pelicula pelicula = new Pelicula("Casa blanca", 90, 16, "Maria JT");
        	// Pido datos para el cine
	        int filas=Metodo.pideInt("Introduce el numero de filas");
	        
	        	int columnas=Metodo.pideInt("Intrdouce el numero de columnas");
	        
	        		double precio=Metodo.pideDouble("Introduce el precio de la entrada de cine");
        
        //Creo el cine
        Cinema cine = new Cinema(filas, columnas, precio, pelicula);

        //Numero de espectadores en fila
        int numEspectadores = Metodo.pideInt("Introduce el numero de espectadores a crear");

        //Variables y objetos usados
        Espectador espectador;
        int fila;
        char letra;

        System.out.println("Espectadores generados: ");
        //Termino cuando no queden espectadores o no haya mas sitio en el cine
        for (int i = 0; i < numEspectadores && cine.haySitio(); i++) {

            //Generamos un espectador
            espectador = new Espectador(
                    Metodo.nombres[Metodo.generaNumeroEnteroAleatorio(0, Metodo.nombres.length - 1)], //Nombre al azar
                    Metodo.generaNumeroEnteroAleatorio(10, 30), //Generamos una edad entre 10 y 30 a�os
                    Metodo.generaNumeroEnteroAleatorio(1, 10)); //Generamos el dinero entre 1 y 10 euros

            //Mostramos la informacion del espectador
            System.out.println(espectador);
            
            //Generamos una fila y letra
            //Si esta libre continua sino busca de nuevo
            do {

                fila = Metodo.generaNumeroEnteroAleatorio(0, cine.getFilas() - 1);
                letra = (char) Metodo.generaNumeroEnteroAleatorio('A', 'A' + (cine.getColumnas()-1));

            } while (cine.haySitioButaca(fila, letra));

            //Si el espectador cumple con las condiciones
            if (cine.sePuedeSentar(espectador)) {
            	espectador.pagar(cine.getPrecio()); //El espectador paga el precio de la entrada
                cine.sentar(fila, letra, espectador); //El espectador se sienta
            }

        }

        System.out.println("");
        cine.mostrar(); //Mostramos la informaci�n del cine, tambien se puede usar un toString
        
        System.out.println("Empieza la funcion...");
		
	}

}
