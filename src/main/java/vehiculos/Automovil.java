package vehiculos;

public class Automovil extends Vehiculo {
    private int puestos;
    public static int n_vehiculos;
    public Automovil(String placa, String nombre, int  precio, int peso, Fabricante fabricante, int puestos){
        super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
        this.placa = placa;
        this.puertas= puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;
        this.puestos = puestos;

    }
    public int getPuestos(){
        return puestos;
    }
    public void setPuestos(int puestos){
        this.puestos = puestos;
    }
}
