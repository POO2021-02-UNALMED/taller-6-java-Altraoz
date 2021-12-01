package vehiculos;

import java.util.ArrayList;

public class Fabricante {

    private static ArrayList<Fabricante> fabricas = new ArrayList<Fabricante>();
    private String nombre;
    private Pais pais;
    private int vehiculosFabricados;

    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        fabricas.add(this);
    }

    public String getNombre() {
        return nombre;
    }
    public Pais getPais() {
        return pais;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public void vehiculoFabricado () {
        vehiculosFabricados ++;
    }
    public int getVehiculosFabricados() {
        return vehiculosFabricados;
    }
    public void setVehiculosFabricados(int vehiculosFabricados) {
        this.vehiculosFabricados = vehiculosFabricados;
    }

    public static Fabricante fabricaMayorVentas() {
        Fabricante mayoresVentas = fabricas.get(0);

        for (int i = 1; i<fabricas.size(); i++) {
            if (fabricas.get(i).getVehiculosFabricados() > mayoresVentas.getVehiculosFabricados()) {
                mayoresVentas = fabricas.get(i);
            }
        }

        return mayoresVentas;
    }
}
