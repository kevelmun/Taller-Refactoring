package modelos;

import java.util.ArrayList;

public class Profesor extends Persona{
    private String codigo;
    private InformacionAdicionalProfesor info;

    public Profesor(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }

    public void anadirParalelos(Paralelo p){
        getParalelos().add(p);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public InformacionAdicionalProfesor getInfo() {
        return info;
    }

    public void setInfo(InformacionAdicionalProfesor info) {
        this.info = info;
    }
    
    
}
