package clase4;

public class Libro {
    // atributos
    private String titulo;
    private String autor;
    private double precio;

    public Libro(String titulo, String autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + "]";
    }

    public double calcularPrecio(Libro[] libros) {
        double total = 0.0;
        for (int i = 0; i < libros.length; i++) {
            total +=libros[i].getPrecio();
        }
        return total;
    }

    public static void ordenLibrosPrecio(Libro[] libros) {

        for (int i = 0; i < libros.length - 1; i++) {
            for (int j = 0; j < libros.length - i - 1; j++) {
                if (libros[j].getPrecio() > libros[j + 1].getPrecio()) {
                    // intercambio de libros
                    Libro temp = libros[j];
                    libros[j] = libros[j + 1];
                    libros[j + 1] = temp;
                }
            }
        }
     }

}
