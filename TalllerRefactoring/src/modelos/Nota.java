/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author NewPc
 */
public class Nota {
    private double nexamen;
    private double ndeberes;
    private double nlecciones;
    private double ntalleres;
    private double valor;

    public double getNexamen() {
        return nexamen;
    }

    public void setNexamen(double nexamen) {
        this.nexamen = nexamen;
    }

    public double getNdeberes() {
        return ndeberes;
    }

    public void setNdeberes(double ndeberes) {
        this.ndeberes = ndeberes;
    }

    public double getNlecciones() {
        return nlecciones;
    }

    public void setNlecciones(double nlecciones) {
        this.nlecciones = nlecciones;
    }

    public double getNtalleres() {
        return ntalleres;
    }

    public void setNtalleres(double ntalleres) {
        this.ntalleres = ntalleres;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Nota() {
        valor = 0;
    } 
 
    //Calcula y devuelve la nota contando examen, deberes, lecciones y talleres. El teorico y el practico se calcula por parcial.
    public double CalcularNota(Estudiante e, Paralelo p){
        for(Paralelo par:e.getParalelos()){
            if(p.equals(par)){
                double notaTeorico=(nexamen+ndeberes+nlecciones)*0.80;
                double notaPractico=(ntalleres)*0.20;
                valor=notaTeorico+notaPractico;
            }
        }
        return valor;
    }

}
