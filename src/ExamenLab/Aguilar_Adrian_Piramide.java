/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamenLab;

import java.util.Scanner;

/**
 *
 * @author adrianaguilar
 */
public class Aguilar_Adrian_Piramide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
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
        
    }
}
