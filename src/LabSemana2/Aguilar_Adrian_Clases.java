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
public class Aguilar_Adrian_Clases {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa la fecha (día / DD / MM):");
        String fecha = sc.nextLine();

        
        int pleca1 = fecha.indexOf("/");
        int pleca2 = fecha.indexOf("/", pleca1 + 1);

        
        String diaSemana = fecha.substring(0, pleca1);

        String diaTexto = fecha.substring(pleca1 + 1, pleca2);
        int dia = Integer.parseInt(diaTexto);

        
        String mesTexto = fecha.substring(pleca2 + 1);
        int mes = Integer.parseInt(mesTexto);

       
        boolean diaValido = diaSemana.equals("lunes") || diaSemana.equals("martes") ||
                            diaSemana.equals("miércoles") || diaSemana.equals("miercoles") || 
                            diaSemana.equals("jueves") || diaSemana.equals("viernes");

        if (!diaValido || dia < 1 || dia > 31 || mes < 1 || mes > 12) {
            System.out.println("Se produjo un error en los datos ingresados.");
            return; 
        }

        if (diaSemana.equals("lunes")) {
            System.out.print("¿Hubo exámenes? (si/no): ");
            String examenes = sc.nextLine().toLowerCase();
            if (examenes.equals("si")) {
                System.out.print("¿Cuántos aprobaron?: ");
                int aprobados = sc.nextInt();
                System.out.print("¿Cuántos no aprobaron?: ");
                int noAprobados = sc.nextInt();
                int total = aprobados + noAprobados;
                double porcentaje = (aprobados * 100.0) / total;
                System.out.println("Porcentaje de aprobados: " + porcentaje + "%");
            }

        
        } else if (diaSemana.equals("martes")) {
            System.out.print("¿Hubo exámenes? (si/no): ");
            String examenes = sc.nextLine().toLowerCase();
            if (examenes.equals("si")) {
                System.out.print("¿Cuántos aprobaron?: ");
                int aprobados = sc.nextInt();
                System.out.print("¿Cuántos no aprobaron?: ");
                int noAprobados = sc.nextInt();
                int total = aprobados + noAprobados;
                double porcentaje = (aprobados * 100.0) / total;
                System.out.println("Porcentaje de aprobados: " + porcentaje + "%");
            }

        
        } else if (diaSemana.equals("miércoles") || diaSemana.equals("miercoles")) {
            System.out.print("¿Hubo exámenes? (si/no): ");
            String examenes = sc.nextLine().toLowerCase();
            if (examenes.equals("si")) {
                System.out.print("¿Cuántos aprobaron?: ");
                int aprobados = sc.nextInt();
                System.out.print("¿Cuántos no aprobaron?: ");
                int noAprobados = sc.nextInt();
                int total = aprobados + noAprobados;
                double porcentaje = (aprobados * 100.0) / total;
                System.out.println("Porcentaje de aprobados: " + porcentaje + "%");
            }

       
        } else if (diaSemana.equals("jueves")) {
            System.out.print("Porcentaje de asistencia (%): ");
            double asistencia = sc.nextDouble();
            if (asistencia > 50) {
                System.out.println("Asistió la mayoría");
            } else {
                System.out.println("No asistió la mayoría");
            }

        
        } else if (diaSemana.equals("viernes")) {
            if (dia == 1 && (mes == 1 || mes == 7)) {
                System.out.println("Comienzo de nuevo ciclo");
                System.out.print("Cantidad de alumnos: ");
                int alumnos = sc.nextInt();
                System.out.print("Precio por alumno (Lps.): ");
                double precio = sc.nextDouble();
                double ingresoTotal = alumnos * precio;
                System.out.println("Ingreso total del ciclo: Lps." + ingresoTotal);
            } else {
                System.out.println("No hay noticia para viajeros");
            }
        }
    }
}
