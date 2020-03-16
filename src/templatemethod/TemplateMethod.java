/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatemethod;

/**
 *
 * @author estudiantes
 */
public class TemplateMethod {
    
    static Computador computador;
    
    public static void main(String args[]) {
        
        /*computador = new ComputadorAMDRadeonM2();
        System.out.print("Armando Computador AMD RADEON M.2");
        computador.armarComputador();
        
        computador = new ComputadorIntelNvidiaSsd();
        System.out.print("Armando Computador Intel Nvidia SSD");
        computador.armarComputador();*/
        
        computador = new ComputadorAMDRadeonM2();
        System.out.print("Armando Computador AMD RADEON M.2 \n");
        computador.armarComputador();
        System.out.print("Computador AMD Ensamblado... Finish \n\n");
        
        computador = new ComputadorIntelNvidiaSsd();
        System.out.print("Armando Computador Intel Nvidia SSD \n");
        computador.armarComputador();
        System.out.print("Computador Intel Ensamblado... Finish");
    }

    
}
