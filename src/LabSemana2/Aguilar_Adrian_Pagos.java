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
public class Aguilar_Adrian_Pagos {
    public static void main(String[] args) {
        


        Scanner sc = new Scanner(System.in);
        String codigoEmpleado, nombreEmpleado, apellidoEmpleado;
        
        System.out.print("Código del empleado: ");
        codigoEmpleado = sc.nextLine();

        System.out.print("Nombre del empleado: ");
         nombreEmpleado = sc.nextLine();

        System.out.print("Apellido del empleado: ");
        apellidoEmpleado = sc.nextLine();

        System.out.print("Cantidad de horas trabajadas: ");
        int horasTrabajadas = sc.nextInt();

        System.out.println("Categorías:");
        System.out.println("1 - 40 por hora extra");
        System.out.println("2 - 50 por hora extra");
        System.out.println("3 - 85 por hora extra");
        System.out.println("4 - Sin derecho a horas extras");
        System.out.print("Ingrese la categoría del empleado (1-4): ");
        int categoria = sc.nextInt();

        
       int horasNormales;
        int horasExtras;

        if (horasTrabajadas <= 40) {
    horasNormales = horasTrabajadas;
    horasExtras = 0;
        } else {
         horasNormales = 40;
        horasExtras = horasTrabajadas - 40;
}


        if (horasExtras > 15) {
            horasExtras = 15; 
        }

        double pagoHoraNormal = 35.99;
        double pagoHoraExtra = 0;

    
        switch (categoria) {
            case 1:
                pagoHoraExtra = 40;
                break;
            case 2:
                pagoHoraExtra = 50;
                break;
            case 3:
                pagoHoraExtra = 85;
                break;
            case 4:
                pagoHoraExtra = 0;
                horasExtras = 0;
                break;
            default:
                System.out.println("error de categoria");
                return;
        }

     
        double totalNormal = horasNormales * pagoHoraNormal;
        double totalExtra = horasExtras * pagoHoraExtra;
        double totalPago = totalNormal + totalExtra;

        
        System.out.println("Resumen del empleado");
        System.out.println("Código: " + codigoEmpleado);
        System.out.println("Nombre: " + nombreEmpleado + " " + apellidoEmpleado);
        System.out.println("Horas normales trabajadas: " + horasNormales);
        System.out.println("Horas extra pagadas: " + horasExtras);
        System.out.println("Categoría: " + categoria);
        System.out.println("Pago por horas normales: Lps." + totalNormal);
        System.out.println("Pago por horas extra: Lps." + totalExtra);
        System.out.println("Total a pagar: Lps." + totalPago);
    }
}

        
        
