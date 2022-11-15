package Entidades;

/**
 *
 * @author NeuenMartinez
 */
public final class Gato extends Animal{

    public Gato(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentarse() {
        System.out.println("El gato " + nombre + " se alimenta de: " + alimento);    
    }
}
