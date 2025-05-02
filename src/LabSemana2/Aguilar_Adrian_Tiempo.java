/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabSemana2;

import java.util.Scanner;

/**
 *
 * @author adrianaguilar
 */
public class Aguilar_Adrian_Tiempo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número de segundos: ");
        int segundos = sc.nextInt();
        
        if (segundos <= 0) {
            System.out.println("Segundos Invalidos, fin del programa");
        }

        String resultado;
    


    if (segundos > 0) {
            int horas = segundos / 3600;
            int resto = segundos % 3600;
            int minutos = resto / 60;
            int segundosFinales = resto % 60;

            resultado = "Horas: " + horas + ", Minutos: " + minutos + ", Segundos: " + segundosFinales;
             System.out.println(resultado);
        }
       
    }

}
