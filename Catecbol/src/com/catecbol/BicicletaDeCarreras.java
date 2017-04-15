package com.catecbol;

public class BicicletaDeCarreras extends Bicicleta  {
    String nombre;
    int velocidad;

    @Override
    public int getVelocidad() {
        return velocidad;
    }

    public  void imprimirColor( String color){

        System.out.println("El color de la bicicleta es: "+ color);
    }
    public  void imprimirColor( String colorMarco, String tenedor){

        System.out.println("El color de la bicicleta es: "+ colorMarco +
        " y "+ tenedor);
    }

    @Override
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad*4;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
