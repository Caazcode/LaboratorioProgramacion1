/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenLab;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author adrianaguilar
 */
public class Aguilar_adrian_adivinar {
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroRandom = random.nextInt(100) + 1;
        int intentosUsuario = 10;
        int contadorIntentos = 0;
        int numeroUsuario;

        System.out.println("--Bienvenido al juego de adivinar el número--");

        while (contadorIntentos < intentosUsuario) {
            System.out.println("\nIntento #" + (contadorIntentos + 1));
            System.out.print("Ingresa un número del 1 al 100: ");
            numeroUsuario = sc.nextInt();
            contadorIntentos++;

            if (numeroUsuario == numeroRandom) {
                System.out.println("Felicidades! Adivinaste el número en " + contadorIntentos + " intentos.");
                break;
            } else if (numeroUsuario < numeroRandom) {
                System.out.println("El número que ingresaste es MENOR que el número a adivinar.");
            } else {
                System.out.println("El número que ingresaste es MAYOR que el número a adivinar.");
            }
        }

        if (contadorIntentos == intentosUsuario) {
            System.out.println("\nNo puedes continuar! Has alcanzado el límite de intentos.");
            System.out.println("El número correcto era: " + numeroRandom);
        }
    }
}