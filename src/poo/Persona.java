package poo;

import java.util.Scanner;

public class Persona {

    // attributos (caracteristicas)
    public String nombre, apellido, pais;
    public int edad, numTelefono;
    final String RAZA = "Humano"; // constante debe ir en mayus, con valor y con final
    String planeta = "Ea"; // variable
    //public int year = 2024;

    // constructor vacio
    public Persona() {
    }

    // constructor con todos los atts
    
    /* public Persona(String nombre, String apellido, int edad, int numTelefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.numTelefono = numTelefono;
    } */

    public Persona(String nombre, String apellido, int edad, int numTelefono, String pais, String planeta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.edad = edad;
        this.numTelefono = numTelefono;
        this.planeta = planeta;
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

            System.out.println("Ingrese pais");
            scan.nextLine(); // para evitar salto de linea al pasar de un nextInt a un nextLine
            pais = scan.nextLine();
        }
        Persona persona = new Persona(nombre, apellido, edad, numTelefono, pais, planeta);

        return persona;
    }

    

    @Override
    public String toString() {
        //RAZA = "et"; // constante raza no puede ser reasignada
        planeta = "Tierra"; // variable puede ser modificada
        return "Planeta: " + planeta + " - Raza: " + RAZA + " - [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", numTelefono="
                + numTelefono + ", pais=" + pais + "]";
    }

    // metodos vacio
    public void respira() {
        System.out.println("Soy persona y respiro");
    }

    // metodos (acciones)
    public String etario() {
        if (edad > 17) { // 17 nº mágico debe ir en una variable descriptiva ej: edad_max_menor
            return "mayor";
        } else {
            return "menor";
        }
    }

}
