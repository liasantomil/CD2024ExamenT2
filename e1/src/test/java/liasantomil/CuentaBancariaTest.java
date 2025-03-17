package liasantomil;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*

public class CuentaBancariaTest{

    /*getTitular */
    @Test
    void testGetTitular() {
        CuentaBancaria cuenta = new CuentaBancaria("Juan", 1000);
        assertEquals("Ana", cuenta.getTitular());

    }

    /*getSaldo*/
    @Test
    void testGetSaldo() {
        CuentaBancaria cuenta = newe CuentaBancaria ("Juan", 1000);
        assertEquals("1000", cuenta.getSaldo());
    }

    /*depositar */
    @Test
    void testDepositar(){
        CuentaBancaria cuenta = new CuentaBancaria("Juan", 1000);
        cuenta.depositar(500);
        assertEquals(1500, cuenta.getSaldo());
    }

    /*cantidad menor a cero */
    @Test
    void testDepositarCantidadNegativa(){
        CuentaBancaria cuenta = new CuentaBancaria("Juan", 1000);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            cuenta.depositar(-100);
        });

        assertEquals("La cantidad a depositar debe ser mayor que cero.", exception.getMessage());
    }

    /*retirar */
    @Test
    void testRetirar(){
        CuentaBancaria cuenta = new CuentaBancaria("Juan", 1000);
        cuenta.retirar(500);
        assertEquals(500, cuenta.getSaldo());
    }
    /*cantidad meyor al saldo */
    @Test
    void testRetirarCantidadMayorQueElSaldo(){
        CuentaBancaria cuenta = new CuentaBancaria("Juan", 1000);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            cuenta.retirar(2000);
        });

        assertEquals("No se puede retirar más cantidad de la que hay en el saldo", exception.getMessage());
    }

    /*cantidad menor a cero */
    @Test
    void testRetirarCantidadNegativa(){
        CuentaBancaria cuenta = new CuentaBancaria("Juan", 1000);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {

            cuenta.retirar(-100);
        });

        assertEquals("La cantidad a retirar tiene que ser mayor a 0.", exception.getMessage());

    }

    /*cantidad igual a cero */

    @Test
    void testRetirarCantidadCero() {
        CuentaBancaria cuenta = new CuentaBancaria("Juan", 1000);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            cuenta.retirar(0);
        });

        assertEquals("La cantidad a retirar tiene que ser mayor a 0.", exception.getMessage());
    }
}