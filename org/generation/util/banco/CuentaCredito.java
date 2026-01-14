package org.generation.util.banco;

import java.util.Date;

public class CuentaCredito extends Cuenta {

    private Date fechaCorte;
    private float tasa;
    private double limite;

    public CuentaCredito(
            double saldo,
            String numeroCliente,
            Date fechaCorte,
            Date fechaApertura,
            float tasa,
            double limite,
            String nombreCliente) {

        super(saldo, numeroCliente, fechaApertura, nombreCliente);
        this.fechaCorte = fechaCorte;
        this.tasa = tasa;
        this.limite = limite;
    }

    public float getTasa() {
        return tasa;
    }

    public void setTasa(float tasa) {
        this.tasa = tasa;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public Date getFechaCorte() {
        return fechaCorte;
    }

    @Override
    public double getSaldo() {
        saldo -= 3;
        return saldo;
    }

    @Override
    public double retiro(double monto) {
        if ((limite - saldo) >= monto) {
            saldo += monto;
            saldo += monto * 0.05;
        } else {
            saldo += 5;
        }
        return saldo;
    }

    @Override
    public double deposito(double monto) {
        saldo -= monto;
        return saldo;
    }

    @Override
    public String toString() {
        return "Cuenta Crédito [" + super.toString() +
                " Tasa=" + getTasa() + "%, Límite=" + getLimite() + "]";
    }
}

