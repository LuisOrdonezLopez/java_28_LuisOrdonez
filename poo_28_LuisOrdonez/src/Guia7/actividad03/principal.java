package Guia7.actividad03;

public class principal {

    public static void main(String[] args) {
        Carro_28 carro1 = new Carro_28();

        int asientos = carro1.asientosCarro();
        boolean estado = carro1.estadoCarro();

        carro1.mostrarDatos();
        System.out.println("El número de asientos disponibles es de " + asientos + " y el estado actual del coche se vería " + estado);
    }

}
