/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author Laboratorio
 */
public class Corriente extends Cuenta{
    private int lineaCredito;

    public Corriente(int lineaCredito, int rut, String numero, int saldo) {
        super(rut, numero, saldo);
        this.lineaCredito = lineaCredito;
    }

    public int getLineaCredito() {
        return lineaCredito;
    }

    public void setLineaCredito(int lineaCredito) {
        this.lineaCredito = lineaCredito;
    }

    @Override
    public String toString() {
        return "Corriente{" + super.toString() + "lineaCredito=" + lineaCredito + '}';
    }
    
    
    
}
