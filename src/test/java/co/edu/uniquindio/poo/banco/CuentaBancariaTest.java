package co.edu.uniquindio.poo.banco;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuentaBancariaTest {

    @Test
    void depositarTest() {
        Titular titular = new Titular("John", "Garcia");
        CuentaBancaria cuenta = new CuentaCorriente(123456789, titular, 1000);
        cuenta.depositar(500);
        Assertions.assertEquals(500, cuenta.consultarSaldo());
    }
    @Test
    void retirarTest() {
        Titular titular = new Titular("John", "Garcia");
        CuentaBancaria cuenta = new CuentaCorriente(123456789, titular, 1000);
        cuenta.depositar(1500);
        cuenta.retirar(1000);
        Assertions.assertEquals(500, cuenta.consultarSaldo());
    }

    @Test
    void transferirTest() {
        Titular titularOrigen = new Titular("John", "Garcia");
        Titular titularDestino = new Titular("Diana", "Garcia");
        CuentaBancaria cuentaOrigen = new CuentaCorriente(123456789, titularOrigen, 1000);
        CuentaBancaria cuentaDestino = new CuentaAhorros(987654321, titularDestino, 0.05);

        cuentaOrigen.depositar(1500);
        boolean transferenciaExitosa = cuentaOrigen.transferir(cuentaDestino, 1000);

        Assertions.assertTrue(transferenciaExitosa);
        Assertions.assertEquals(500, cuentaOrigen.consultarSaldo());
        Assertions.assertEquals(1000, cuentaDestino.consultarSaldo());
    }


    @Test
    void testConsultarSaldo(){
        Titular titular = new Titular("John", "Garcia");
        CuentaBancaria cuenta = new CuentaAhorros(123456789, titular, 0.05);
        cuenta.depositar(1000);
        Assertions.assertEquals(1000, cuenta.consultarSaldo());
    }
}