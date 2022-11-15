/*
 * @author NeuenMartinez
 */
package HerenciaEj_01;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;


public class HerenciaEj_01 {

    public static void main(String[] args) {

        Animal perro1 = new Perro("Pituca", "Croquetas", 9, "Caniche");
        perro1.alimentarse();
        Animal perro2 = new Perro("Rosca", "Arroz con Pollo", 1, "PUG");
        perro2.alimentarse();
        Animal gato = new Gato("Anvorgueso", "Hamburguesitas", 3, "Naranjoso");
        gato.alimentarse();
        Animal caballo = new Caballo("Spirit", "Pastito", 15, "Pura Sangre");
        caballo.alimentarse();
            
    }

}