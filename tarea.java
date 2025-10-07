import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class tarea {
    
    public String id;
    public String descripcion;
    public int prioridad = 0;
    public double tiempoEstimado;

    public tarea(String id, String descripcion, int prioridad, double tiempoEstimado) {
        this.id = id;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.tiempoEstimado = tiempoEstimado;
    }

    public void GestorTareas(String id, String descripcion, int prioridad, double tiempoEstimado) {
       
        Queue<tarea> colaTareas = new ArrayDeque<>();
        Stack<tarea> pilaPrioridad = new Stack<>();
    
        if (this.prioridad == 3) {
            pilaPrioridad.push(new tarea(id, descripcion, prioridad, tiempoEstimado));

            System.out.println("la tarea con mayor prioridad es: " + pilaPrioridad.peek().id);

        } else if (this.prioridad == 1 || this.prioridad ==2) {
            colaTareas.offer(new tarea(id, descripcion, prioridad, tiempoEstimado));

            System.out.println("la tarea con menor prioridad es: " + colaTareas.peek().id);
        }
    }

    public static void procesarSiguienteTarea(Queue<tarea> colaTareas ,Stack<tarea> pilaPrioridad ) {
        tarea tareaProcesada;
        if (pilaPrioridad.isEmpty()) {
            tareaProcesada = colaTareas.poll();
        } 
            else {
            tareaProcesada = pilaPrioridad.pop();
        }
    } 
}
