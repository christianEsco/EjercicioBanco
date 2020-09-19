/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciobancoo;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public abstract class Banco {
        Scanner in = new Scanner(System.in);
        double Deposito, Retiro;
        static double saldo;

    public void Retiro() {
        System.out.println("-------------------------------------");
        System.out.println("por favor ingrese cuanto va a retirar");
        System.out.println("-------------------------------------");
        Retiro = in.nextDouble();
    }

    public void Deposito() {
        System.out.println("------------------------------------------");
        System.out.println("  Por favor ingrese caunto va a depositar");
        System.out.println("------------------------------------------");
        Deposito = in.nextDouble();
    }

    public void consulta() {
        System.out.println("==================================");
        System.out.println("Su Saldo Actual es de : " + saldo);
        System.out.println("==================================");
    }

    public void limpiar() {
        int lineas = 3;
        for (int i = 0; i < lineas; i++) {
            System.out.println();
        }
    }
   

    public abstract void movimiento();

    public static double getSaldo() {
        return saldo;
    }

    public static void setSaldo(double saldo) {
        Banco.saldo = saldo;
    }

}

