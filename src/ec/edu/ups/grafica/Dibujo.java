/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.grafica;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Geovanny Morocho
 */
public abstract class Dibujo extends Grafico {

    List<Grafico> listaGrafico;
    public String tipo;

    public Dibujo() {
        listaGrafico = new ArrayList<>();
    }
    public void add(Dibujo d){
        listaGrafico.add(d);
    }
    public void remove(Dibujo g) {
        listaGrafico.remove(g);
    }
    public abstract void graficar();
}
