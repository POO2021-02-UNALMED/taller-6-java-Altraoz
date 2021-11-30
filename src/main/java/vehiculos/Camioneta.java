package vehiculos;

public class Camioneta extends Vehiculo {
    private Boolean volco;
    public static int n_vehiculos;
    public Camioneta (String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, Boolean volco){
        super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
        this.placa = placa;
        this.puertas= puertas;
        this.velocidadMaxima = 90;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;
        this.volco = volco;

    }
    public boolean isVolco(){
        return volco;
    }
    public void setVolco(boolean volco){
        this.volco = volco;
    }
}
