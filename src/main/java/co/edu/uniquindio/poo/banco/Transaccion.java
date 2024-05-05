package co.edu.uniquindio.poo.banco;

import java.time.LocalDate;

/**
 * Clase Transaccion modela una transaccion realizada en una cuenta bancaria
 */
public class Transaccion {

    private String codigo;
    private double valor;
    private LocalDate fecha;
    private String descripcion;
    private boolean estado;

    /**
     * Constructor de la clase Transaccion
     * @param codigo
     * @param valor
     * @param fecha
     * @param descripcion
     * @param estado
     */
    public Transaccion(String codigo, double valor, LocalDate fecha, String descripcion, boolean estado) {
        this.codigo = codigo;
        this.valor = valor;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    /**
     * Getters y Setters
     */
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
