package herores;

public class Sayayin {

    protected String colorCabello;
    protected int edad;
    protected String nombre;
    protected double altura;
    protected int nivelKit;
    protected double peso;
    protected String raza;
    public String origen;
    
    // Constructor
    public Sayayin(int edad, int nivelKit){
        this.edad = edad;
        this.nivelKit = nivelKit;
    }
    
    // Sobrecarga de constructores
    public Sayayin(){
        System.out.println("Prueba de un constructor vacio");
    }

    public Sayayin(String colorCabello, int edad, double altura) {
        this.colorCabello = colorCabello;
        this.edad = edad;
        this.altura = altura;
    }

    public Sayayin(String colorCabello, int edad, String nombre, double altura, int nivelKit, double peso, String raza, String origen) {
        this.colorCabello = colorCabello;
        this.edad = edad;
        this.nombre = nombre;
        this.altura = altura;
        this.nivelKit = nivelKit;
        this.peso = peso;
        this.raza = raza;
        this.origen = origen;
    }
    
    
    
}
