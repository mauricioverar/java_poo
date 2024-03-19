public class Persona {

    // attributos (caracteristicas)
    public String nombre;
    public String apellido;
    public int edad;
    public int numTelefono;


    // contructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // constructor vacio
    public Persona() {
    }

    // constructor con todos los att
    public Persona(String nombre, String apellido, int edad, int numTelefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.numTelefono = numTelefono;
    }

    // metodos (acciones)
    public static void imprimirInformacion(String nombre, int edad) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    // metodos vacio
    public static void respira() {
        System.out.println("Soy persona y respiro");
    }

    // metodos vacio
    public  void camina() {
        System.out.println("Soy persona y camino");
    }

    // metodos (acciones)
    public int pasos(int numPasosoAM, int numPasosoPM) {
        int resultado = numPasosoAM + numPasosoPM;
        return resultado;
    }

    // metodos para saber si caminó ( sin void , poner return)
    public boolean camino(int num) {
        if (num < 300) {
            System.out.println("Camino muy poco");
            return false;
        } else {
            System.out.println("Camino arto");
            return true;
        }
    }

}
