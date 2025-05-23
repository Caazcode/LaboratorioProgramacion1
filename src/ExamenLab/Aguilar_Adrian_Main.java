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
public class Aguilar_Adrian_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("-- MENÚ PRINCIPAL --");
            System.out.println("1. Piramide");
            System.out.println("2. Opción 2");
            System.out.println("3. Juego Piedra papel o tijera");
            System.out.println("4. Juego Adivina Numero");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                        System.out.print("Ingrese la cantidad de filas para la piramide: ");
                        int fila = sc.nextInt();

                        int valor1 = 1;
                        int incremento = 2;
                        for (int i = 1; i <= fila; i++) {
                            int suma = 0;
                            for (int j = 0; j < i; j++) {
                                System.out.print(valor1 + " ");
                                suma += valor1;
                                valor1 += incremento;
                            }
                            System.out.println("= " + suma);
                        }
                    break;
                case 2:
                    
                    break;
                case 3:
                    
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

                        break;
            
            
                case 4:
                    
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
                  break;
                  
                  
                  
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }

        } while (opcion != 5);
    
}

}
