package Guia7.actividad05;

public class Asesor_28 {
    String nombre;
    String apellido;
    int numCelular;
    int numTeam;
    
    public Asesor_28(String nombre,String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public void mostrarDatos1(){
        System.out.println("El nombre es "+nombre+" "+apellido+".");
    }
    
    public void mostrarDatos2(){
        System.out.println("Su número de celular es "+numCelular+" y está encargado del Team "+numTeam+".");
    }
}
