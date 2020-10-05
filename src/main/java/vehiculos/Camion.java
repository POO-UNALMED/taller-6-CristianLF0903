package vehiculos;

public class Camion extends Vehiculo {
  private int ejes;

  static int camiones = 0;

  public Camion() {
    camiones++;
  }

  public Camion(
    String placa,
    String nombre,
    int precio,
    int peso,
    Fabricante fabricante,
    int ejes
  ) {
    this.placa = placa;
    this.nombre = nombre;
    this.peso = peso;
    this.fabricante = fabricante;
    this.ejes = ejes;
    puertas = 2;
    velocidadMaxima = 80;
    traccion = "4X2";

    camiones++;
  }

  public void setEjes(int ejes) {
    this.ejes = ejes;
  }

  public int getEjes() {
    return ejes;
  }

  public static int cantidadCamiones() {
    return camiones;
  }
}
