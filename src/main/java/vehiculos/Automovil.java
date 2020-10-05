package vehiculos;

public class Automovil extends Vehiculo {
  private int puestos;

  static int automoviles = 0;

  public Automovil() {
    automoviles++;
  }

  public Automovil(
    String placa,
    String nombre,
    int precio,
    int peso,
    Fabricante fabricante,
    int puestos
  ) {
    this.puestos = puestos;
    puertas = 4;
    velocidadMaxima = 100;
    traccion = "FWD";
    this.peso = peso;
    this.placa = placa;
    this.nombre = nombre;
    this.precio = precio;
    this.fabricante = fabricante;

    automoviles++;
  }

  public static int cantidadAutomoviles() {
    return automoviles;
  }

  public void setPuestos(int puestos) {
    this.puestos = puestos;
  }

  public int getPuestos() {
    return puestos;
  }
}
