package Entidades;

/**
 *
 * @author NeuenMartinez
 */
public final class Perro extends Animal{

    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentarse() {
        System.out.println("El perro " + nombre + " se alimenta de: " + alimento);    
    }

    
}
