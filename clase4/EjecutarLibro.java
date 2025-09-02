package clase4;

import java.lang.reflect.Array;

public class EjecutarLibro {
    public static void main(String[] args) {    
    //creacion de objetos
    Libro[] libros =new Libro[5];

    libros [0]= new Libro("cien anos de soledad", "Gabriel Garcia Marques", 2000);
    libros [1]= new Libro("bajo la misma concha", "prepucio99", 1000);
    libros [2]= new Libro("bajo el mismo techo", "FLorinda mesa", 1500);
    libros [3]= new Libro("O todos en la cama o todos en el suelo", "Mi Mama", 3000);
    libros [4]= new Libro("Relato de un naufrago", "Gabriel Garcia Marques", 1100);
    
    double precioTotal= libros[0].calcularPrecio(libros);
    System.out.println("EL precio total del los libros es: "+ precioTotal);
    //tarea metodo burbuja
    
    //ordenar forma creciente
    libros[0].ordenLibrosPrecio(libros);
    System.out.println("libros ordenados de menor a mayor precio: ");
        for (int i = 0; i < libros.length; i++) {
            System.out.println(libros[i]);
        }
    
     }
   }



