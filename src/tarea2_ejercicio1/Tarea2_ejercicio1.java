/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2_ejercicio1;

import java.util.Scanner;

/**
 *
 * @author ROCIO
 */
public class Tarea2_ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        System.out.println("Escribe algun número del 1 al 5");
        int menú = entrada.nextInt();
        if (menú >= 1 && menú <= 5) {
            if (menú == 1) {
                System.out.println("debe salir");
            } else if (menú == 2) {
                System.out.println("debe caminar");  
            } else if (menú == 3) {
                System.out.println("debe bailar");
            } else if (menú == 4) {
                System.out.println("debe estudiar");
            } else if (menú == 5) {
                System.out.println("debe correr");
            }
        } else {
            System.out.println("Elija un número valido");
        }
        }
    }


