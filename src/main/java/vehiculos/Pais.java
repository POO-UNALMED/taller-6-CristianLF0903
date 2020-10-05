package vehiculos;

import java.util.ArrayList;

public class Pais {
  private String nombre;
  private int vehiculosVendidos = 0;

  static ArrayList<Pais> paises = new ArrayList<>();

  public Pais() {
    paises.add(this);
  }

  public Pais(String nombre) {
    this.nombre = nombre;
    paises.add(this);
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public void setVehiculosVendidos(int vendidos) {
    vehiculosVendidos = vendidos;
  }

  public int getVehiculosVendidos() {
    return vehiculosVendidos;
  }

  public void vehiculoVendido() {
    vehiculosVendidos++;
  }

  public static Pais paisMasVendedor() {
    Pais masVendedor = paises.get(0);
    for (int i = 1; i < paises.size(); i++) {
      if (
        paises.get(i).getVehiculosVendidos() >
        masVendedor.getVehiculosVendidos()
      ) {
        masVendedor = paises.get(i);
      }
    }
    return masVendedor;
  }
}
