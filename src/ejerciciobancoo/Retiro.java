/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciobancoo;

/**
 *
 * @author christian
 */
public class Retiro extends Banco{
    @Override
    public void movimiento() {
        limpiar();
        consulta();
        Retiro();
        if (Retiro > getSaldo()) {

            System.out.println("-------------------------------------");
            System.out.println("Usted no cuenta con el dinero suficiente \n"
                    + "para realizar esta accion");
            System.out.println("-------------------------------------");
        } else {
            double saldoRetiro = getSaldo();
            setSaldo(saldoRetiro - Retiro);
            System.out.println("-------------------------------------");
            System.out.println("Usted acaba de retirar " + Retiro);
            System.out.println("Su slado actual es de: " + getSaldo());
            System.out.println("-------------------------------------");
        }
        limpiar();
    }
    
}
