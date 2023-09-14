/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Cuenta;
import java.util.ArrayList;

public class Coleccion {
    
    //definiciónjn de la cuenta
    ArrayList<Cuenta> listadoCuentas = new ArrayList<>();
    
    //Agregar cuenta precargada
    public void agregarCuenta(Cuenta c){
        listadoCuentas.add(c);
    }
    
    //listado de cuenta en tabla
    public ArrayList listarCuenta(){
        return listadoCuentas;
    }
}
