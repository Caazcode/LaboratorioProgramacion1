/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LabSemana1.LabSemana1;

import java.util.Scanner;

/**
 *
 * @author adrianaguilar
 */
public class Aguilar_Adrian_Formulas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("---Expresiones Algebraicas--");
        
        
        double ProblemaA = ((3/2)+(4/3));
        System.out.println("Resultado Problema A: "+ ProblemaA);
        
        ////////////
        
        System.out.println("Problema matematico b:");
        System.out.print("Ingresa el valor de x: ");
        double ValorX = sc.nextDouble();
        
        System.out.print("Ingresa el valor de y: ");
        double ValorY = sc.nextDouble();
        
        double resultadoB = (1 / (ValorX - 5)) - ((3 * ValorX * ValorY)/ 4);
        System.out.println("El resultado de (1/(x - 5)) - (3xy/4) es: " + resultadoB);
        
        ////////////
        
        System.out.println("Problema matematico c: ");
         double resultadoC = ((1/2)+7);
        System.out.println("El resultado de ((1/2)+7) es: " + resultadoC);
        
        /////////
        
        System.out.println("Problema matematico D: ");
         double resultadoD = ((1/2)+7);
        System.out.println("El resultado de (7+(1/2)) es: " + resultadoD);
        ///////////
        
         System.out.println("\nProblema matematico E:");
        System.out.print("Ingresa el valor de a: ");
        double ValorA = sc.nextDouble();
        System.out.print("Ingresa el valor de b: ");
        double ValorB = sc.nextDouble();
        System.out.print("Ingresa el valor de c: ");
        double ValorC = sc.nextDouble();
        System.out.print("Ingresa el valor de d: ");
        double ValorD = sc.nextDouble();
        System.out.print("Ingresa el valor de e: ");
        double  ValorE = sc.nextDouble();
        System.out.print("Ingresa el valor de f: ");
        double ValorF = sc.nextDouble();
        System.out.print("Ingresa el valor de g: ");
        double ValorG = sc.nextDouble();
        System.out.print("Ingresa el valor de h: ");
        double ValorH = sc.nextDouble();
        System.out.print("Ingresa el valor de j: ");
        double ValorJ = sc.nextDouble();

        double aCuadrado = ValorA * ValorA;
        double resultadoE = (aCuadrado / (ValorB - ValorC)) + ((ValorD - ValorE) / (ValorF - (ValorG * ValorH / ValorJ)));
        System.out.println("El resultado de (a^2)/(b-c) + (d-e)/(f-g*h/j) es: " + resultadoE);
        
        //////////
        
         
        System.out.println("\nProblema matematico: F");
        System.out.print("Ingresa el valor de m: ");
        double ValorM = sc.nextDouble();
        System.out.print("Ingresa el valor de n: ");
        double ValorN = sc.nextDouble();
        System.out.print("Ingresa el valor de p: ");
        double ValorP = sc.nextDouble();
        double resultadoF = (ValorM / ValorN) + ValorP;
        System.out.println("El resultado de (m/n) + p es: " + resultadoF);


        System.out.println("\nProblema matematico G: ");
        System.out.print("Ingresa el valor de p: ");
        double ValorQ = sc.nextDouble();
        double resultadoG = (ValorM + ValorN) / (ValorP - ValorQ);
        System.out.println("El resultado de (m + n)/(p - q) es: " + resultadoG);


        System.out.println("\nProblema matematico H: ");

        double bCuadrado = ValorB * ValorB;
        double cCuadrado = ValorC * ValorC;
        double dCuadrado = ValorD* ValorD;
        double resultadoH = (aCuadrado / bCuadrado) + (cCuadrado / dCuadrado);
        System.out.println("El resultado de (a^2/b^2) + (c^2/d^2) es: " + resultadoH);


        System.out.println("\nProblema matematico I: ");
        System.out.print("Ingresa el valor de q: ");
        double ValorQ2 = sc.nextDouble();
        System.out.print("Ingresa el valor de r: ");
        double ValorR = sc.nextDouble();
        System.out.print("Ingresa el valor de s: ");
        double ValorS = sc.nextDouble();
        double resultadoI = (ValorM + (ValorN / ValorP)) / (ValorQ2 - (ValorR / ValorS));
        System.out.println("El resultado de (m + (n/p))/(q - (r/s)) es: " + resultadoI);


        System.out.println("\nProblema matematico J: ");
        System.out.print("Ingresa el valor de e: ");
        double ValorE2 = sc.nextDouble();
        double resultadoJ = ((3 * ValorA + ValorB) / (ValorC - (ValorD + 5 * ValorE2))) / ((ValorF + ValorG) / (2 * ValorH));
        System.out.println("El resultado de ((3a + b)/(c - (d + 5e)))/((f + g)/(2h)) es: " + resultadoJ);


        System.out.println("\nProblema matematico K:");

        double resultadoK = (aCuadrado + 2 * ValorA * ValorB + ValorB * ValorB) / (1 / (ValorX * ValorX + 2));
        System.out.println("El resultado de (a^2 + 2ab + b^2)/(1/(x^2 + 2)) es: " + resultadoK);
        
        System.out.println("Gracias");
        
    }
}
