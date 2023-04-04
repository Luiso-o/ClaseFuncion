package Cinema;

public class Espectador {

    private String nombre;
    private int edad;
    private double dinero;

    public Espectador(String nombre, int edad, double dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

//Getters y setters---------------------------------------------------------------------------
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    //------------------------------------------------------------------------------
    
//    Pagamos la entrada del cine     
    public void pagar(double precio) {
        dinero -= precio;
    }
    
//     Indicamos si el espectador tiene edad para ver la pelicula 
    public boolean tieneEdad(int edadMinima) {
        return edad >= edadMinima;
    }

//     Indicamos si el espectador tiene dinero   
    public boolean tieneDinero(double precioEntrada) {
        return dinero >= precioEntrada;
    }

    public String toString() {
    	
        return "Espectador: " + nombre + " de " + edad + " a�os y con " + dinero + " euros en su bolsillo";
        
    }	
	
}
