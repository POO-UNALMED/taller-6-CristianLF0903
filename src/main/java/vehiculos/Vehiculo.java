package vehiculos;

public class Vehiculo {
  protected String placa;
  protected int puertas;
  protected int velocidadMaxima;
  protected String nombre;
  protected int precio;
  protected int peso;
  protected String traccion;
  protected Fabricante fabricante;

  static int vehiculos = 0;

  public Vehiculo() {
    vehiculos++;
  }

  public Vehiculo(
    String placa,
    int puertas,
    int velocidadMaxima,
    String nombre,
    int precio,
    int peso,
    String traccion,
    Fabricante fabricante
  ) {
    this.placa = placa;
    this.peso = peso;
    this.fabricante = fabricante;
    this.nombre = nombre;
    this.traccion = traccion;
    this.precio = precio;
    this.puertas = puertas;
    this.velocidadMaxima = velocidadMaxima;

    vehiculos++;
    fabricante.vehiculoVendido();
  }

  public void setPlaca(String placa) {
    this.placa = placa;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setPeso(int peso) {
    this.peso = peso;
  }

  public void setPuertas(int puertas) {
    this.puertas = puertas;
  }

  public void setVelocidadMaxima(int velocidadMaxima) {
    this.velocidadMaxima = velocidadMaxima;
  }

  public void setPrecio(int precio) {
    this.precio = precio;
  }

  public void setTraccion(String traccion) {
    this.traccion = traccion;
  }

  public void setFabricante(Fabricante fabricante) {
    this.fabricante = fabricante;
  }

  public String getPlaca() {
    return placa;
  }

  public int getPuertas() {
    return puertas;
  }

  public String getNombre() {
    return nombre;
  }

  public int getVelocidadMaxima() {
    return velocidadMaxima;
  }

  public String getTraccion() {
    return traccion;
  }

  public int getPrecio() {
    return precio;
  }

  public int getPeso() {
    return peso;
  }

  public Fabricante getFabricante() {
    return fabricante;
  }

  public static void setCantidadVehiculos(int a) {
    vehiculos = a;
  }

  public static int getCantidadVehiculos() {
    return vehiculos;
  }

  public static String testCantidadTipos() {
    String comp =
      "Automoviles: " +
      Automovil.cantidadAutomoviles() +
      "\nCamionetas: " +
      Camioneta.cantidadCamionetas() +
      "\nCamiones: " +
      Camion.cantidadCamiones();

      return comp;
  }
}
