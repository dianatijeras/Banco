package co.edu.uniquindio.poo.banco;

import java.time.LocalDate;

/**
 * Clase CuentaCorriente modela una cuenta corriente
 */
public class CuentaCorriente extends CuentaBancaria{

    private double sobregiro;

    /**
     * Constructor de la clase CuentaCorriente
     * @param numeroCuenta
     * @param titular
     * @param sobregiro
     */
    public CuentaCorriente(int numeroCuenta, Titular titular, double sobregiro) {
        super(numeroCuenta, titular);
        this.sobregiro = sobregiro;
    }

    /**
     *Getters y Setters
     */
    public double getSobregiro() {
        return sobregiro;
    }

    public void setSobregiro(double sobregiro) {
        this.sobregiro = sobregiro;
    }

    /**
     * Metodo para retirar dinero de la cuenta corriente
     * @param monto
     */
    @Override
    public void retirar (double monto){
        if (monto > 0.0){
            double saldoActual = getSaldo() + getSobregiro();
            if (monto <= saldoActual){
                setSaldo(getSaldo() - monto);
                if (getSaldo() == 0){
                    setEstado(false);
                }
                getListaTransacciones().add(new Transaccion("Retiro2", monto, LocalDate.now(), "Retiro", true));
            } else {
                System.out.println("El monto solicitadi supera el limite de sobregiro");
            }
        } else {
            System.out.println("El monto a retirar deber ser mayor que cero");
        }
    }

}
