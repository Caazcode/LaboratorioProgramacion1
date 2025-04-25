/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labprogramacion1.LabSemana1;

/**
 *
 * @author adrianaguilar
 */
public class Aguilar_Adrian_Clics {
    public static void main(String[] args) {
        
        double clics60 = 60, clics100 = 100, clics20 = 20, costo60Clics = 0.30, costo100Clics = 0.25, costo20Clics = 0.80;
        double Isv = 0.16;
        double TotalconIsv, promedio, totalsinIsv, TotalFinal;
        
        promedio = ((clics60 * costo60Clics) + (clics100 * costo100Clics) + (clics20 * costo20Clics)) / 180;
        
        totalsinIsv = (clics60 * costo60Clics) + (clics100 * costo100Clics) + (clics20 * costo20Clics);
        
        TotalconIsv = totalsinIsv * Isv;
        
        TotalFinal = TotalconIsv + totalsinIsv;
        
       System.out.println("Precio promedio de clicks: " + String.format(" %.2f", promedio));
        System.out.println("ISV Total: " + String.format( "%.2f", TotalconIsv));
        System.out.println("Total con ISV: Lps. " + String.format("%.2f", TotalFinal));
        
        
        
    }
}
