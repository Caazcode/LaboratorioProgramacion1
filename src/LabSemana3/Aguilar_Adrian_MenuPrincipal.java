/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabSemana3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author adrianaguilar
 */
public class Aguilar_Adrian_MenuPrincipal {
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        int opcionMenu;
        int numeroIngresado;
        int vecesPerfecto = 0;
        int numeroAleatorio;
        int numeroPrimo = 0;
        int vecesReversa = 0;
        int vecesPrimo = 0;
        int vecesVotos = 0;
        int votoAzul = 0, votoRojo = 0, votoNegro = 0, votoAmarillo = 0, votoNulo = 0;
        int votoValido = 0;
        int totalVotantes;
        
        int cantidadPalabras;
        String palabraIngresada;
        String palabraInvertida = "";
        String palabraMasLarga = "";
        int longitudMayor = 0;

        
        String voto;
        
        do{
        System.out.println("Menu principal: ");
        System.out.println("Que desea realizar?");
        System.out.println("1 - Cambiar palabras al reves");
        System.out.println("2 - Numero perfecto");
        System.out.println("3 - Numeros primos");
        System.out.println("4 - Votaciones");
        System.out.println("5 - Salir del sistema");
        System.out.println("Ingrese una opcion: ");
        opcionMenu = sc.nextInt();
        
       
            
            switch (opcionMenu){
            
            case 1:
                     System.out.println("--Palabras al revés--");


                System.out.print("¿Cuántas palabras desea ingresar? ");
                cantidadPalabras = sc.nextInt();
               

                for (int i = 1; i <= cantidadPalabras; i++) {
                    System.out.print("Ingrese la palabra #" + i + ": ");
                    palabraIngresada = sc.nextLine();

                    
                    palabraInvertida = "";
                    for (int j = palabraIngresada.length() - 1; j >= 0; j--) {
                        palabraInvertida += palabraIngresada.charAt(j);
                    }

                    System.out.println("Palabra al revés: " + palabraInvertida);

                   
                    if (palabraIngresada.length() > longitudMayor) {
                        longitudMayor = palabraIngresada.length();
                        palabraMasLarga = palabraIngresada;
                    }
                }

                System.out.println("La palabra más larga fue: " + palabraMasLarga + " (" + longitudMayor + " letras)");

                
                boolean esPalindromo = true;
                for (int i = 0; i < palabraMasLarga.length() / 2; i++) {
                    if (palabraMasLarga.charAt(i) != palabraMasLarga.charAt(palabraMasLarga.length() - 1 - i)) {
                        esPalindromo = false;
                        break;
                    }
                }

                if (esPalindromo) {
                    System.out.println("La palabra más larga ES un palíndromo.");
                } else {
                    System.out.println("La palabra más larga NO es un palíndromo.");
                }

                vecesReversa++;
                break;
                    
                    
            case 2: 
                    System.out.println("--Numeros perfectos--");
                    System.out.println("Ingresa un numero: ");
                    numeroIngresado = sc.nextInt();
                    int suma = 0;
                    for (int i = 1; i < numeroIngresado; i++) {
                        if (numeroIngresado % i == 0) {
                            suma += i;
                        }
                    }
                    if (suma == numeroIngresado) {
                        System.out.println(numeroIngresado + " es un numero perfecto.");
                    } else {
                        System.out.println(numeroIngresado + " no es un numero perfecto.");
                    }
                    vecesPerfecto++;
                    break;
                    
                    
                    
                    
                
            case 3: 
                    
                    System.out.println("--Numeros primos--");

   
                     numeroAleatorio = random.nextInt(100) + 1;
                    System.out.println("El numero generado es: " + numeroAleatorio);

                     int divisores = 0;

                     System.out.print("Divisores de " + numeroAleatorio + " son: ");
                     for (int i = 1; i <= numeroAleatorio; i++) {
                     if (numeroAleatorio % i == 0) {
                      System.out.print(i + " ");
                    divisores++;
                    }
                }


               if (divisores == 2) {
                System.out.println("Primo " + numeroAleatorio + " porque solo tiene dos divisores.");
                } else {
                System.out.println("No primo " + numeroAleatorio + " porque tiene " + divisores + " divisores.");
                 }

                vecesPrimo++;
                break;
                
        
            case 4:
                    
                    
                    System.out.print("Ingrese la cantidad total de votantes: ");
                    totalVotantes = sc.nextInt();
                   
                    for (int i = 1; i <= totalVotantes; i++) {
                        System.out.print("Ingrese voto #" + i + " (AZUL, ROJO, NEGRO o AMARILLO): ");
                        voto = sc.nextLine().toUpperCase();

                        if (voto.equals("AZUL")) {
                            votoAzul++;
                            votoValido++;
                        } else if (voto.equals("ROJO")) {
                            votoRojo++;
                            votoValido++;
                        } else if (voto.equals("NEGRO")) {
                            votoNegro++;
                            votoValido++;
                        } else if (voto.equals("AMARILLO")) {
                            votoAmarillo++;
                            votoValido++;
                        } else {
                            votoNulo++;
                        }
                    }

                    System.out.println("\n--- RESULTADOS ---");
                    System.out.println("AZUL: " + votoAzul + " votos");
                    System.out.println("ROJO: " + votoRojo + " votos");
                    System.out.println("NEGRO: " + votoNegro + " votos");
                    System.out.println("AMARILLO: " + votoAmarillo + " votos");
                    System.out.println("NULOS: " + votoNulo + " votos");

                    double porcentajeValido = (votoValido * 100.0) / totalVotantes;

                    if (porcentajeValido >= 60) {
                        if (votoAzul > votoRojo && votoAzul > votoNegro && votoAzul > votoAmarillo) {
                            System.out.println("Ganadora: Planilla AZUL");
                        } else if (votoRojo > votoAzul && votoRojo > votoNegro && votoRojo > votoAmarillo) {
                            System.out.println("Ganadora: Planilla ROJA");
                        } else if (votoNegro > votoAzul && votoNegro > votoRojo && votoNegro > votoAmarillo) {
                            System.out.println("Ganadora: Planilla NEGRA");
                        } else if (votoAmarillo > votoAzul && votoAmarillo > votoRojo && votoAmarillo > votoNegro) {
                            System.out.println("Ganadora: Planilla AMARILLA");
                        }
                    } else {
                        System.out.println("VOTACIÓN FALLIDA. Solo " + porcentajeValido + "% de votos fueron válidos.");
                    }

                    vecesVotos++;
                    break;

                    
            
            case 5: 
                    
                    System.out.println("-- Veces ingresada cada opcion: --");
                    System.out.println("1 - Palabra al reves: " + vecesReversa + " veces");
                    System.out.println("2 - Numero perfecto: " + vecesPerfecto + " veces");
                    System.out.println("3 - Numero Primos: " + vecesPrimo + " veces");
                    System.out.println("4 - Votaciones: " + vecesVotos + " veces");
                    break;

             default:
                    System.out.println("Opcion no valida.");
                    break;
            }
        }while (opcionMenu != 5);
    }
}
