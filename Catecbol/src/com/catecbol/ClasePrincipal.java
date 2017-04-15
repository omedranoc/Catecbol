package com.catecbol;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class ClasePrincipal {

    public static void main(String[] args) {



        BicicletaDeCarreras bicicletaDeCarreras = new BicicletaDeCarreras();
        //bicicletaDeCarreras.setNombre("Negrita");
        bicicletaDeCarreras.setVelocidad(40);
        bicicletaDeCarreras.imprimirColor("blanco", "rojo");


        System.out.println("la velocidad de es: "+ bicicletaDeCarreras.getVelocidad() );
    }
}
