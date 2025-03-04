import java.util.Scanner;

public class Libro {
    private String titulo;
    private String autor;
    private int numEjemplares;
    private int ejemplaresPrestados;

    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.numEjemplares = 0;
        this.ejemplaresPrestados = 0;
    }

    public Libro(String titulo, String autor, int numEjemplares, int ejemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
        this.ejemplaresPrestados = ejemplaresPrestados;
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

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public int getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(int ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public boolean prestar() {
        if (numEjemplares > ejemplaresPrestados) {
            ejemplaresPrestados++;
            return true;
        } else {
            return false;
        }
    }

    public boolean devolver() {
        if (ejemplaresPrestados > 0) {
            ejemplaresPrestados--;
            return true;
        } else {
            return false;
        }
    }
    public String toString() {
        return "Título: " + titulo + "\nAutor: " + autor + "\nEjemplares: " + numEjemplares + "\nPrestados: " + ejemplaresPrestados;
    }
}