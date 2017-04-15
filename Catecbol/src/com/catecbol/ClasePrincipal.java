package com.catecbol;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class ClasePrincipal {

    public static void main(String[] args) {

        Bicicleta bicicletaDeRonny =  new Bicicleta();
        bicicletaDeRonny.setVelocidad(30);
        bicicletaDeRonny.setCadencia(8);
        bicicletaDeRonny.setCambios(3);

        Bicicleta bicicletaDeSaul = new Bicicleta();
        bicicletaDeSaul.setCadencia(12);
        bicicletaDeSaul.setCambios(1);
        bicicletaDeSaul.setVelocidad(25);

        BicicletaDeCarreras bicicletaDeCarreras = new BicicletaDeCarreras();
        bicicletaDeCarreras.setNombre("Negrita");
        bicicletaDeCarreras.setVelocidad(40);

        System.out.println("velocidad: "+ bicicletaDeRonny.getVelocidad() );
        System.out.println("velocidad: "+ bicicletaDeSaul.getVelocidad() );
        System.out.println("la velocidad de "+bicicletaDeCarreras.getNombre()
                + " es: "+ bicicletaDeCarreras.getVelocidad() );
    }
}
