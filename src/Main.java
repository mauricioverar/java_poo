//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        // instanciar a la clase Persona y construir objeto
        Persona persona1 = new Persona("Juan", 30); //("Juan", 30)

        persona1.camina();
        System.out.println(persona1.nombre);

        // proceso
        System.out.println("Ingrese nombre");
        String nombre = leer.nextLine();

        System.out.println("Ingrese apellido");
        String apellido = leer.nextLine();

        System.out.println("Ingrese edad");
        int edad = leer.nextInt();

        System.out.println("Ingrese telefono");
        int telefono = leer.nextInt();

        // otro objeto
        Persona persona2 = new Persona(nombre, apellido, edad, telefono);

        //System.out.println(persona2); //@52cc8049
        System.out.println(persona2.toString());

        //persona1.imprimirInformacion();
        //persona2.imprimirInformacion();
        
        leer.close();
    }
}