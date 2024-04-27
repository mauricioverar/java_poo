
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package poo;

public class Main {
    public static void main(String[] args) {

        // instanciar a la clase Persona y construir objeto
        Persona persona = new Persona();

        // llamar metodos
        persona = persona.crearPersona();
        persona.respira();

        System.out.println(persona.nombre+" es "+persona.etario()+" de edad");

        // mostrar resultado
        System.out.println(persona.toString());
        //System.out.println(persona); // ok

        //System.out.println(persona2); //@52cc8049
    }
}