package vehiculos;

import java.util.ArrayList;

public class Pais {

    private static ArrayList<Pais> paises = new ArrayList<Pais>();
    private int vehiculosFabricados;
    private String nombre;

    public Pais(String nombre) {
        this.nombre = nombre;
        paises.add(this);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void vehiculoFabricado() {
        vehiculosFabricados ++;
    }

    public int getVehiculosFabricados() {
        return vehiculosFabricados;
    }

    public void setVehiculosFabricados(int vehiculosFabricados) {
        this.vehiculosFabricados = vehiculosFabricados;
    }

    public static Pais paisMasVendedor() {
        Pais masVendedor = paises.get(0);

        for (int i = 1; i < paises.size(); i++) {
            if (paises.get(i).getVehiculosFabricados() > masVendedor.getVehiculosFabricados()) {
                masVendedor = paises.get(i);
            }
        }
        return masVendedor;
    }
}
