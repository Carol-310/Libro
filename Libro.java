import java.util.Scanner;

public class Libro {

    private String titulo;
    private String autor;
    private int numEjemplares;
    private int numEjemplaresPrestados;

    
    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.numEjemplares = 0;
        this.numEjemplaresPrestados = 0;
    }

    
    public Libro(String titulo, String autor, int numEjemplares, int numEjemplaresPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
        this.numEjemplaresPrestados = numEjemplaresPrestados;
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

    public int getNumEjemplaresPrestados() {
        return numEjemplaresPrestados;
    }

    public void setNumEjemplaresPrestados(int numEjemplaresPrestados) {
        this.numEjemplaresPrestados = numEjemplaresPrestados;
    }

    
    public boolean prestamo() {
        if (numEjemplaresPrestados < numEjemplares) {
            numEjemplaresPrestados++;
            return true;
        } else {
            return false;
        }
    }

    
    public boolean devolucion() {
        if (numEjemplaresPrestados > 0) {
            numEjemplaresPrestados--;
            return true;
        } else {
            return false;
        }
    }

    
    @Override
    public String toString() {
        return "Título: " + titulo +
               "\nAutor: " + autor +
               "\nNúmero de ejemplares: " + numEjemplares +
               "\nNúmero de ejemplares prestados: " + numEjemplaresPrestados;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        Libro libro1 = new Libro("chocolate para el alma", "adam samdler", 8, 0);

        
        Libro libro2 = new Libro();
        System.out.println("Ingrese título del libro:");
        libro2.setTitulo(scanner.nextLine());
        System.out.println("Ingrese autor del libro:");
        libro2.setAutor(scanner.nextLine());
        System.out.println("Ingrese número de ejemplares:");
        libro2.setNumEjemplares(scanner.nextInt());
        System.out.println("Ingrese número de ejemplares prestados:");
        libro2.setNumEjemplaresPrestados(scanner.nextInt());
        scanner.close(); 

        
        System.out.println("\nLibro 1:");
        System.out.println(libro1.toString());
        System.out.println("\nLibro 2:");
        System.out.println(libro2.toString());

        System.out.println("\nPréstamo de libro 1: " + libro1.prestamo());
        System.out.println("Préstamo de libro 2: " + libro2.prestamo());

        System.out.println("\nLibro 1 después del préstamo:");
        System.out.println(libro1.toString());
        System.out.println("\nLibro 2 después del préstamo:");
        System.out.println(libro2.toString());

        System.out.println("\nDevolución de libro 1: " + libro1.devolucion());
        System.out.println("Devolución de libro 2: " + libro2.devolucion());

        System.out.println("\nLibro 1 después de la devolución:");
        System.out.println(libro1.toString());
        System.out.println("\nLibro 2 después de la devolución:");
        System.out.println(libro2.toString());
    }
}