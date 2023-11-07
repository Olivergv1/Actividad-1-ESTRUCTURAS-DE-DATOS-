public class Computadora {
    private String tipo; // si es de escritorio o portatil
    private String marca; // nombre de la marca comercial 
    private double precio; // precio comercial
    private int ram; // Tamaño de RAM en GB
    private String tipoProcesador; // tipo de procesador que usa la computadora
    private double velocidadProcesador; // Velocidad del procesador en GHz
    private int capacidadAlmacenamiento; // Capacidad de almacenamiento en GB

    // Constructor
    public Computadora(String tipo, String marca, double precio,
                       int ram, String tipoProcesador, double velocidadProcesador, int capacidadAlmacenamiento) {
        this.tipo = tipo;
        this.marca = marca;
        this.precio = precio;
        this.ram = ram;
        this.tipoProcesador = tipoProcesador;
        this.velocidadProcesador = velocidadProcesador;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    // Metodos para obtener información de la computadora
    public String getTipo() {
        return tipo;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    public int getRam() {
        return ram;
    }
    
    public String getTipoProcesador() {
        return tipoProcesador;
    }
    
    public double getVelocidadProcesador() {
        return velocidadProcesador;
    }

    public int getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    // Metodos para mostrar información de la computadora
    public void mostrarInformacion() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Marca: " + marca);
        System.out.println("Precio: $" + precio);
        System.out.println("RAM: " + ram + " MB");
        System.out.println("Tipo de procesador: " + tipoProcesador);        
        System.out.println("Velocidad del procesador: " + velocidadProcesador + " GHz");
        System.out.println("Capacidad de almacenamiento: " + capacidadAlmacenamiento + " GB");
    }

    public static void main(String[] args) {
        // se crean dos instancias de la clase computadora  una representando una laptop y una computadora de escritorio, y luego muestra información sobre ellas.
        
        Computadora laptop = new Computadora("Portatil", "LENOVO", 874.46, 16, "Intel Core i7", 4.7, 512);
        Computadora escritorio = new Computadora("Escritorio", "HP", 700.00, 8, "AMD Ryzen 5", 3.0, 1024);

        System.out.println("Informacion de la Laptop:");
        laptop.mostrarInformacion();

        System.out.println("\nInformacion de la computadora de escritorio:");
        escritorio.mostrarInformacion();
    }
}
