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
public class Cuenta {
    private int rut;
    private String numero;
    private int saldo;

    public Cuenta(int rut, String numero, int saldo) {
        this.rut = rut;
        this.numero = numero;
        this.saldo = saldo;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "rut=" + rut + ", numero=" + numero + ", saldo=" + saldo + '}';
    }
    
    
    
}
