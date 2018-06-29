/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.grafica;

/**
 *
 * @author Geovanny Morocho
 */
public class Circulo extends Grafico {

    public Circulo() {
    tipo="Circulo";
    }
    
    @Override
    public void graficar() {
        System.out.println("\t  * * *");
        System.out.println("\t*       *");
        System.out.println("\t*       *");
        System.out.println("\t*       *");
        System.out.println("\t*       *");
        System.out.println("\t  * * * ");
    }

}
