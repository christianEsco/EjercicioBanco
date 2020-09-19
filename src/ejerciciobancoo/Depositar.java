/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciobancoo;


 

 
public class Depositar extends Banco {
    @Override
    public void movimiento() {
        double saldoDeposito = getSaldo();
        limpiar();
        consulta();
        Deposito();
        setSaldo(saldoDeposito + Deposito);
        System.out.println("-------------------------------------");
        System.out.println("Usted acaba de Depositar " + Deposito);
        System.out.println("Su slado actual es de: " + getSaldo());
        System.out.println("-------------------------------------");
        limpiar();
    }
}

    

