import java.util.Arrays;
public class Estudiante{
    //atributos
    private int id;
    private int cedula;
    private String nombre;
    private String facultad;
    private String [] cursos;

    //constructor
    public Estudiante(int id, int cedula, String nombre, String facultad){
        this.id=id;
        this.cedula=cedula;
        this.nombre = nombre;
        this. facultad = facultad;
    }
    //metodo matricular cursos
    public void matricularCursos(String[]cursos){
        this.cursos=cursos;
        System.out.println(Arrays.toString(cursos));
    }
    //metodo toString
    public String toString(){ // toString es un método de la clase Object que proporciona una representación textual de un objeto, convirtiéndolo en una cadena de texto (String)
        return "Estudiante: [id: "+ id+ " + Cedula: " +cedula+ "Nombre: " + nombre + "Facultad: "+ facultad+"]";
    
    }
}