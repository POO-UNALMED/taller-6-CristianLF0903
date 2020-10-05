package vehiculos;

public class Camioneta extends Vehiculo {
  private boolean volco;

  static int camionetas = 0;

  public Camioneta() {
    camionetas++;
  }

  public Camioneta(
    String placa,
    int puertas,
    String nombre,
    int precio,
    int peso,
    Fabricante fabricante,
    boolean volco
  ) {
    this.puertas = puertas;
    this.nombre = nombre;
    this.peso = peso;
    this.precio = precio;
    this.fabricante = fabricante;
    velocidadMaxima = 90;
    traccion = "4X4";
    this.volco = volco;

    camionetas++;
  }

  public void setVolco(boolean volco) {
    this.volco = volco;
  }

  public Boolean isVolco() {
    return volco;
  }

  public static int cantidadCamionetas() {
    return camionetas;
  }
}
