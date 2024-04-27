package poo;

import java.util.Scanner;

public class Persona {

    // attributos (caracteristicas)
    public String nombre;
    public String apellido;
    public int edad;
    public int numTelefono;
    public int year = 2024;

    // constructor vacio
    public Persona() {
    }

    // constructor con todos los atts
    public Persona(String nombre, String apellido, int edad, int numTelefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.numTelefono = numTelefono;
    }

    // metodo crear
    public Persona crearPersona() {
        try (Scanner scan = new Scanner(System.in)) {
            // ingresar datos
            System.out.println("Ingrese nombre");
            nombre = scan.nextLine();

            System.out.println("Ingrese apellido");
            apellido = scan.nextLine();

            System.out.println("Ingrese edad");
            edad = scan.nextInt();

            System.out.println("Ingrese telefono");
            numTelefono = scan.nextInt();
        }
        Persona persona = new Persona(nombre, apellido, edad, numTelefono);

        return persona;
    }

    

    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", numTelefono="
                + numTelefono + "]";
    }

    // metodos vacio
    public void respira() {
        System.out.println("Soy persona y respiro");
    }

    // metodos (acciones)
    public String etario() {
        if (edad > 17) {
            return "mayor";
        } else {
            return "menor";
        }
    }

}
