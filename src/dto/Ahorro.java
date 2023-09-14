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
public class Ahorro extends Cuenta{

    public Ahorro(int rut, String numero, int saldo) {
        super(rut, numero, saldo);
    }

    @Override
    public String toString() {
        return "Ahorro{" + super.toString() + '}';
    }
    
    
}
