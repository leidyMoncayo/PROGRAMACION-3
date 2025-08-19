public class EjecutarEstudiante{
    public static void main (String[]args){

    //creacion de objetos
    Estudiante objEst1 = new Estudiante(1,1000657966, "Angelica", "ingenieria");
    Estudiante objEst2 = new Estudiante(2,1001256512, "Miguel", "ingenieria"); 
    Estudiante objEst3 = new Estudiante(3,1000999111, "Byron", "ingenieria");
     
     System.out.println(objEst1);
     //creacion del arreglo de objetos (Estudiantes)
     Estudiante[] e=new Estudiante[4];
     e[0]=objEst1; 
     e[1]=objEst2;
     e[2]=objEst3;
     e[3]= new Estudiante(4, 100, "Peter", "Ingenieria");
    
}