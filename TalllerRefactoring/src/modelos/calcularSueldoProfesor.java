package modelos;

public class calcularSueldoProfesor {
    
    public double calcularSueldo(Profesor prof){
        double sueldo=0;
        sueldo= prof.getInfo().get*600 + prof.getInfo().BonoFijo;
        return sueldo;
    }  
}
