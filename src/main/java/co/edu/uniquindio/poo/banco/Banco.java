package co.edu.uniquindio.poo.banco;

import java.util.Collection;
import java.util.LinkedList;

/**
 * La clase Banco modela un banco que contiene una lista de titulares y una lista de cuentas bancarias
 */
public class Banco {

    private final String nombre;
    private Collection<Titular> listaTitulares;
    private Collection<CuentaBancaria> cuentasBancarias;

    /**
     * Constructor de la clase Banco
     * @param nombre
     */
    public Banco (String nombre){

        this.nombre= nombre;
        this.listaTitulares = new LinkedList<>(); //Inicializa la lista de titulares como una lista vacia
        this.cuentasBancarias = new LinkedList<>(); // Inicializa la lista de cuentas bancarias como una lista vacia
    }

    /**
     *Getters y Setters
     */
    public String getNombre() {
        return nombre;
    }

    public Collection<Titular> getListaTitulares() {
        return listaTitulares;
    }

    public void setListaTitulares(Collection<Titular> listaTitulares) {
        this.listaTitulares = listaTitulares;
    }

    public Collection<CuentaBancaria> getCuentasBancarias() {
        return cuentasBancarias;
    }

    public void setListaCuentaBancarias(Collection<CuentaBancaria> cuentasBancarias) {
        this.cuentasBancarias = cuentasBancarias;
    }

    public void agregarTitular(Titular titular){
        listaTitulares.add(titular);
    }

    /**
     * Metodo para crear una cuenta corriente y agregarla a la lista de cuentas bancarias del banco
     * @param numeroCuenta
     * @param titular
     * @param sobregiro
     */
    public void crearCuentaCorriente(int numeroCuenta, Titular titular, double sobregiro){
        CuentaCorriente cuentaCorriente = new CuentaCorriente(numeroCuenta, titular, sobregiro);
        cuentasBancarias.add(cuentaCorriente);
    }

    /**
     * Metodo para crear una cuenta de ahorros y agregarla a la lista de cuentas bancarias del banco
     * @param numeroCuenta
     * @param titular
     * @param tasaInteres
     */
    public void crearCuentaAhorros(int numeroCuenta, Titular titular, double tasaInteres){
        CuentaAhorros cuentaAhorros = new CuentaAhorros(numeroCuenta, titular, tasaInteres);
        cuentasBancarias.add(cuentaAhorros);
    }
}
