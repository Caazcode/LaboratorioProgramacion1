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
public class Aguilar_Adrian_PlanillaEmpleado {
   public static void main(String[] args) {
    String nombreEmpleado;
        int horasMensuales;
        double tarifasHoras;
        double salarioSemanal;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("----- Boleta del Empleado -------");
        System.out.println("Ingrese el nombre del empleado: ");
        nombreEmpleado = sc.next();
        
        System.out.println("Ingrese las horas de trabajo mensual: ");
        horasMensuales = sc.nextInt();
        
        System.out.println("Ingrese la tarifa por hora trabajada: ");
        tarifasHoras = sc.nextDouble();
        
        salarioSemanal = (horasMensuales / 4) * tarifasHoras;
        
        System.out.println("----- Boleta del Empleado -------");
        System.out.println("El nombre del empleado es: " + nombreEmpleado);
        System.out.println("Horas de trabajo mensuales del empleado: " + horasMensuales );
        System.out.println("Tarifa de la hora trabajada es: Lps. " + tarifasHoras);
        System.out.println("Salario del Empleado Semanal: Lps. " + salarioSemanal);
   }
}
