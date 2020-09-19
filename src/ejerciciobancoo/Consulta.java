/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciobancoo;

/**
 *
 * @author DELL
 */
public class Consulta extends Banco {

    @Override
    public void movimiento() {
  
        System.out.println("Su Saldo Actual es de : " + getSaldo());
        System.out.println("==================================");
        limpiar();
    }

}