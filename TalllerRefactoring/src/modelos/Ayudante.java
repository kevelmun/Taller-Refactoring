package modelos;

import java.util.ArrayList;

public class Ayudante extends Estudiante{
    protected Estudiante est;
    private ArrayList<Paralelo> paralelos;

    public Ayudante(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }
    }

