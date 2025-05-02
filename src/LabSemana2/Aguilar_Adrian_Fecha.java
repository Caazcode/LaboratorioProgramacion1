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


public class Aguilar_Adrian_Fecha {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String fecha1, fecha2;

        System.out.println("Ingresa la primera fecha: (Día/Mes/Año)");
        fecha1 = sc.nextLine();

        System.out.println("Ingresa la segunda fecha: (Día/Mes/Año)");
        fecha2 = sc.nextLine();

        
        int pleca1 = fecha1.indexOf("/");
        int pleca2 = fecha1.indexOf("/", pleca1 + 1);

        int dia1 = Integer.parseInt(fecha1.substring(0, pleca1));
        int mes1 = Integer.parseInt(fecha1.substring(pleca1 + 1, pleca2));
        int anio1 = Integer.parseInt(fecha1.substring(pleca2 + 1));

        
        int pleca3 = fecha2.indexOf("/");
        int pleca4 = fecha2.indexOf("/", pleca3 + 1);

        int dia2 = Integer.parseInt(fecha2.substring(0, pleca3));
        int mes2 = Integer.parseInt(fecha2.substring(pleca3 + 1, pleca4));
        int anio2 = Integer.parseInt(fecha2.substring(pleca4 + 1));

        
        int totalDias1 = (anio1 * 360) + (mes1 * 30) + dia1;
        int totalDias2 = (anio2 * 360) + (mes2 * 30) + dia2;

        
        int diferencia = Math.abs(totalDias1 - totalDias2);

        System.out.println("La diferencia entre las dos fechas es de " + diferencia + " días.");
    }
}

