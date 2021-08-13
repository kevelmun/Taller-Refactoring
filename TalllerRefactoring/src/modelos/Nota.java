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
    private double constantePractica=0.20;
    private double constanteTeorica=0.80;
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

    public double getConstantePractica() {
        return constantePractica;
    }

    public void setConstantePractica(double constantePractica) {
        this.constantePractica = constantePractica;
    }

    public double getConstanteTeorica() {
        return constanteTeorica;
    }

    public void setConstanteTeorica(double constanteTeorica) {
        this.constanteTeorica = constanteTeorica;
    }
    
    public Nota() {
        valor = 0;
    } 
 

    public double CalcularNota(Estudiante e, Paralelo p){
        for(Paralelo par:e.getParalelos()){
            if(p.equals(par)){
                double notaTeorico=(nexamen+ndeberes+nlecciones)*constanteTeorica;
                double notaPractico=(ntalleres)*constantePractica;
                valor=notaTeorico+notaPractico;
            }
        }
        return valor;
    }

}
