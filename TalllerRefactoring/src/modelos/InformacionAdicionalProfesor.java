package modelos;

public class InformacionAdicionalProfesor {
    private int añosdeTrabajo;
    private String facultad;
    private double BonoFijo;
    
    public double calcularSueldo(Profesor prof){
        return prof.getInfo().getAñosdeTrabajo()*600 + prof.getInfo().getBonoFijo();
    } 

    public int getAñosdeTrabajo() {
        return añosdeTrabajo;
    }

    public void setAñosdeTrabajo(int añosdeTrabajo) {
        this.añosdeTrabajo = añosdeTrabajo;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public double getBonoFijo() {
        return BonoFijo;
    }

    public void setBonoFijo(double BonoFijo) {
        this.BonoFijo = BonoFijo;
    }
    
}
