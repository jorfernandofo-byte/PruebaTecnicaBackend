package org.generation.util.banco;

import java.util.HashMap;
import java.util.Map;

public class Banco {

    private Map<Integer, Cuenta> cuentas;

    public Banco() {
        cuentas = new HashMap<>();
    }

    // Agregar cuenta
    public void agregarCuenta(Cuenta cuenta) {
        cuentas.put(cuenta.getNumeroCuenta(), cuenta);
    }

    // Obtener cuenta
    public Cuenta obtenerCuenta(int numeroCuenta) {
        return cuentas.get(numeroCuenta);
    }

    // Eliminar cuenta
    public void cancelarCuenta(int numeroCuenta) {
        cuentas.remove(numeroCuenta);
    }

    // Reporte total de débito
    public double totalDebito() {
        double total = 0;
        for (Cuenta c : cuentas.values()) {
            if (c instanceof CuentaDebito) {
                total += c.getSaldo();
            }
        }
        return total;
    }

    // Reporte total de deuda de crédito
    public double totalCredito() {
        double total = 0;
        for (Cuenta c : cuentas.values()) {
            if (c instanceof CuentaCredito) {
                total += c.getSaldo();
            }
        }
        return total;
    }
}
