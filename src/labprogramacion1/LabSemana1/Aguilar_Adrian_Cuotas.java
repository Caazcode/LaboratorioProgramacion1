/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labprogramacion1.LabSemana1;

import java.util.Scanner;

/**
 *
 * @author adrianaguilar
 */
public class Aguilar_Adrian_Cuotas {
     public static void main(String[] args) {
         
         Scanner sc = new Scanner(System.in);
         double montoPrestamo, interes, seguro, comision, interesSimple, cuotaMensual, totalPrestamoConInteres, totalAPagar;
         int plazoMeses;
         
         System.out.println("---Bienvenido a Banca en linea---");
         System.out.println("Ingrese el monto del prestamo: Lps.");
         montoPrestamo = sc.nextDouble();
         
         System.out.println("Ingrese el plazo de meses: ");
         plazoMeses = sc.nextInt();
         
         System.out.println("Ingrese la tasa de interes del prestamo: ");
         interes = sc.nextDouble() / 100 ;
         
         System.out.println("Ingrese la cuota de comision mensual: ");
         comision = sc.nextDouble();
         
         System.out.println("Ingrese el porcentaje de seguro mensual: ");
         seguro = sc.nextDouble() / 100;
         
         interesSimple = (montoPrestamo * interes * plazoMeses) ; 
         
         totalPrestamoConInteres = montoPrestamo + interesSimple;
        
        cuotaMensual = (totalPrestamoConInteres + comision) * (seguro) / plazoMeses;
        
        totalAPagar = cuotaMensual * plazoMeses;
        
        System.out.println("******* CUOTAS MENSUALES *******");
        System.out.println("Cuota de Pago Mensual: Lps. "+ cuotaMensual);
        System.out.println("Total a Pagar:" + totalAPagar);
         
     }
}
