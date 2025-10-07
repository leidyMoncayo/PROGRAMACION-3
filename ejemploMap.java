import java.util.HashMap;

public class ejemploMap {
    public static void main(String[] args) {
        // Crear un HashMap
        HashMap<String, Integer> edades = new HashMap<>();

        // Agregar elementos (clave, valor)
        edades.put("Juan", 25);
        edades.put("Ana", 30);
        edades.put("Pedro", 22);

        // Obtener un valor por su clave
        System.out.println("Edad de Ana: " + edades.get("Ana"));

        // Verificar si una clave existe
        if (edades.containsKey("Pedro")) {
            System.out.println("Pedro está en el mapa");
        }

        // Recorrer todo el mapa
        for (String nombre : edades.keySet()) {
            System.out.println(nombre + " tiene " + edades.get(nombre) + " años");
        }
    }
}

