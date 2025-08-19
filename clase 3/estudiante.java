public class estudiante{
    //atributos
    private int id;
    private int cedula;
    private String nombre;
    private String facultad;

    //constructor
    public estudiante(int id, int cedula, String nombre, String facultad){
        this.id=id;
        this.cedula=cedula;
        this.nombre = nombre;
        this. facultad = facultad;
    }

    //metodo toString
    public String toString(){
        return "Estudiante: [id: "+ id+ " + Cedula: " +cedula+ "Nombre: " + nombre + "Facultad: "+ facultad+"]";
    }
}