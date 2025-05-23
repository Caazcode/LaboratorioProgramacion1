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
public class Aguiar_Adrian_PiedraPapelOTijera {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        Random random = new Random();
        String usuario, computadoraJugando, jugarOtra;
        int numeroComputadora;

        System.out.println("-- Bienvenido al juego de Piedra, Papel o Tijera --");

        do {
            
            System.out.print("\nIngrese su elección (piedra, papel o tijera): ");
            usuario = sc.nextLine().toLowerCase();

            
            while (!usuario.equals("piedra") && !usuario.equals("papel") && !usuario.equals("tijera")) {
                System.out.print("Entrada inválida. Por favor, escribe piedra, papel o tijera: ");
                usuario = sc.nextLine().toLowerCase();
            }

           
            numeroComputadora = random.nextInt(3);
            if (numeroComputadora == 0) {
                computadoraJugando = "piedra";
            } else if (numeroComputadora == 1) {
                computadoraJugando = "papel";
            } else {
                computadoraJugando = "tijera";
            }

       
            
            System.out.println("La computadora eligió: " + computadoraJugando);

            
            if (usuario.equals(computadoraJugando)) {
                System.out.println("¡Empate!");
            } else if ((usuario.equals("piedra") && computadoraJugando.equals("tijera")) ||
                       (usuario.equals("papel") && computadoraJugando.equals("piedra")) ||
                       (usuario.equals("tijera") && computadoraJugando.equals("papel"))) {
                System.out.println("Ganaste el juego!");
            } else {
                System.out.println("Perdiste!");
            }


            System.out.print("Quieres jugar otra vez? (si/no): ");
            jugarOtra = sc.nextLine().toLowerCase();

        } while (jugarOtra.equals("si"));

        System.out.println("¡Gracias por jugar!");
    }
}