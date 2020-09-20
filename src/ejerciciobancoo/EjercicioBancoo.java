/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciobancoo;

import java.util.Scanner;

/**
 *
 *  christian Escobar
 *  Josue chajil
 * Roxana Estrada
 * 
 */
public class EjercicioBancoo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numCuenta = {11, 12, 13};
        String[] persona = {"odeth", "paco", "Roger", ""};
        int numero, pos = 0;
        System.out.println("Ingrese numero de cuenta ");
        numero = in.nextInt();
        for (int i = 0; i < 3; i++) {
            if (numCuenta[i] == numero) {
                pos = i;
                i = 3;

                int opcion;
                boolean Salir = false;
                System.out.println("Hola Bienvenido a su banco de confianza");
                do {
                    System.out.println("por favor Seleccione una de nuestras opciones ");
                    System.out.println("=======================================");
                    System.out.println("=======================================");
                    System.out.println("==========      Menu        ===========");
                    System.out.println("==========  1. Despositar   ===========");
                    System.out.println("==========  2. Retirar      ===========");
                    System.out.println("==========  3. Consultar    ===========");
                    System.out.println("==========  4. Salir        ===========");
                    System.out.println("=======================================");
                    opcion = in.nextInt();

                    switch (opcion) {
                        case 1:
                            Depositar depositar = new Depositar();
                            depositar.movimiento();
                            break;
                        case 2:
                            Retiro retiro = new Retiro();
                            retiro.movimiento();
                            break;
                        case 3:

                            Consulta consulta = new Consulta();
                            System.out.println("\n\n");
                            System.out.println("==================================");
                            System.out.println("Usuario: " + persona[pos]);
                            consulta.movimiento();

                            break;
                        case 4:
                            Salir = true;

                            break;
                        default:
                            System.out.println("\n\n");
                            System.out.println("---------------  XXXXXXXXXXX  -------------");
                            System.out.println("La opcion que usted eligio es incorrecta");
                            System.out.println("por favor ingrese una opcion valida");
                            System.out.println("-------------------------------------------");
                            System.out.println("\n\n");
                            break;
                    }

                } while (!Salir);
                System.out.println("\n\n");
                System.out.println("=======================================");
                System.out.println("=== Gracias por siempre preferirnos ===");
                System.out.println("=======================================");
            } else if (i == 2) {
                i = 3;
                pos = i;
                System.out.println("-------------------------------------------");
                System.out.println("El Numero de cuenta no existe");
                System.out.println("-------------------------------------------");

            }
        }
    }
        
    }
    

