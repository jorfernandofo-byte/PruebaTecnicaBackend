package org.generation.util.banco;

import java.util.Date;

public class CuentaDebito extends Cuenta {

    private double montoMinimo;

    public CuentaDebito(
            double saldo,
            String numeroCliente,
            Date fechaApertura,
            double montoMinimo,
            String nombreCliente) {

        super(saldo, numeroCliente, fechaApertura, nombreCliente);
        this.montoMinimo = montoMinimo;
    }

    public double getMontoMinimo() {
        return montoMinimo;
    }

    public void setMontoMinimo(double montoMinimo) {
        this.montoMinimo = montoMinimo;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public double retiro(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
        }
        return saldo;
    }

    @Override
    public double deposito(double monto) {
        saldo += monto;
        return saldo;
    }

    @Override
    public String toString() {
        return "Cuenta Débito [" + super.toString() +
                ", Monto mínimo=" + montoMinimo + "]";
    }
}
