package modelos;


public class Estudiante extends Persona{
    //Informacion del estudiante
    private String matricula;
    private String facultad;
    private Nota notaInicial;
    private Nota notaFinal;

    public Estudiante(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    
    
    //Calcula y devuelve la nota inicial contando examen, deberes, lecciones y talleres. Esta nota es solo el promedio de las dos calificaciones anteriores.
    public double CalcularNotaTotal(Paralelo p){
        return (notaInicial.getValor()+notaFinal.getValor())/2;
        
    }
    
}