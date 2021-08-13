package modelos;


public class Estudiante extends Persona{
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
    
    

    public double CalcularNotaTotal(Paralelo p){
        return (notaInicial.getValor()+notaFinal.getValor())/2;
        
    }
    
}