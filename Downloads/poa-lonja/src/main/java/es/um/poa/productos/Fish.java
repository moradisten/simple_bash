package es.um.poa.productos;

import java.io.Serializable;

public class Fish implements Serializable {

    private static final int NO_ASIGNADO = -100;

    private EstadoVenta estadoVenta;
    private final TipoProducto tipoProducto;
    private final String nombre;
    private double peso;
    private double precioReserva;
    private double precioSalida;
    private double precioFinal;
    private Tiempo horaRegistro;
    private Tiempo horaVenta;
    private String idComprador;
    private String idVendedor;

    public Fish() {
        nombre = null;
        tipoProducto = TipoProducto.DESCONOCIDO;
    }

    public Fish(String nombre, String tipoProducto, double peso, double precioReserva) {
        TipoProducto tipo = TipoProducto.getType(tipoProducto);
        this.tipoProducto = tipo;
        this.nombre = nombre;
        this.peso = peso;
        this.precioReserva = precioReserva;
        this.precioFinal = NO_ASIGNADO;
        this.precioSalida = NO_ASIGNADO;
        this.estadoVenta = EstadoVenta.REGISTRADO;
        this.idVendedor = "";
        this.idComprador = "";
    }

    public Fish(String nombre, TipoProducto tipoProducto) {
        this.tipoProducto = tipoProducto;
        this.nombre = nombre;
        this.peso = 0;
        this.estadoVenta = EstadoVenta.REGISTRADO;
    }

    public EstadoVenta getEstadoVenta() {
        return estadoVenta;
    }

    public void setEstadoVenta(EstadoVenta estadoVenta) {
        this.estadoVenta = estadoVenta;
    }

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public String getNombre() {
        return nombre;
    }


    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecioReserva() {
        return precioReserva;
    }

    public void setPrecioReserva(double precioReserva) {
        this.precioReserva = precioReserva;
    }

    public double getPrecioSalida() {
        return precioSalida;
    }

    public void setPrecioSalida(double precioSalida) {
        this.precioSalida = precioSalida;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    public Tiempo getHoraRegistro() {
        return horaRegistro;
    }

    public void setHoraRegistro(Tiempo horaRegistro) {
        this.horaRegistro = horaRegistro;
    }

    public Tiempo getHoraVenta() {
        return horaVenta;
    }

    public void setHoraVenta(Tiempo horaVenta) {
        this.horaVenta = horaVenta;
    }

    public String getIdComprador() {
        return idComprador;
    }

    public void setIdComprador(String idComprador) {
        this.idComprador = idComprador;
    }

    public String getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(String idVendedor) {
        this.idVendedor = idVendedor;
    }
}
