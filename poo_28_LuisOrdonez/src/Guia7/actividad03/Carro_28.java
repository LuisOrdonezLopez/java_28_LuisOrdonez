package Guia7.actividad03;

public class Carro_28 {

    String marca = "Toyota";
    double kilometraje = 100;

    public String marcaCarro() {
        return marca;
    }

    public double kilometrajeCarro() {
        return kilometraje;
    }

    public int asientosCarro() {
        return 6;
    }

    public boolean estadoCarro() {
        return false;
    }

    public void mostrarDatos() {
        System.out.println("El auto de la tienda " + marca + " marca un kilometraje de " + kilometraje);
    }
}
