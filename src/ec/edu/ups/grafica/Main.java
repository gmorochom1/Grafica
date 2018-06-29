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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Grafico g = new Circulo();
        System.out.println("\nDibujo : " + g.tipo);
        System.out.println();
        g.graficar();
        System.out.println();

        Grafico r = new Rectangulo();
        System.out.println("\nDibujo : " + r.tipo);
        System.out.println();
        r.graficar();
        System.out.println();

        Grafico l = new Linea();
        System.out.println("\nDibujo : " + l.tipo);
        System.out.println();
        l.graficar();
        System.out.println();

    }

}
