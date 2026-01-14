package org.generation.util.banco;

import org.generation.util.Imprimible;

public class TarjetaRegalo implements Imprimible {

    private int numeroCuenta;
    private double saldo;

    public TarjetaRegalo(int numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    @Override
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    public void deposito(double monto) {
        saldo += monto;
    }

    public boolean consumo(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Tarjeta Regalo [Cuenta=" + numeroCuenta + ", Saldo=" + saldo + "]";
    }
}
