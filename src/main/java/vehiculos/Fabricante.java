package vehiculos;

import java.util.ArrayList;

public class Fabricante {
    
    private String nombre;
    private Pais pais;
    private int vehiculosVendidos = 0;

    static ArrayList<Fabricante> fabricantes = new ArrayList<>();

    public Fabricante(){fabricantes.add(this);}

    public Fabricante(String nombre, Pais pais){
        this.nombre = nombre;
        this.pais = pais;
        fabricantes.add(this);
    }

    public Fabricante(String nombre){
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPais(Pais pais){
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public Pais getPais() {
        return pais;
    }

    public void setVehiculosVendidos(int a) {
        vehiculosVendidos = a;
    }

    public void vehiculoVendido() {
        vehiculosVendidos++;
        pais.vehiculoVendido();
    }

    public int getVehiculosVendidos() {
        return vehiculosVendidos;
    }

    public static Fabricante fabricaMayorVentas() {
        Fabricante mayorVentas = fabricantes.get(0);
        for(int i = 1; i < fabricantes.size(); i++){
            if(fabricantes.get(i).getVehiculosVendidos() > mayorVentas.getVehiculosVendidos()){
                mayorVentas = fabricantes.get(i);
            }
        }
        return mayorVentas;
    }
}
