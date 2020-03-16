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
public class ComputadorAMDRadeonM2 extends Computador {
    
    @Override
    public void atornillarBoard(){
        System.out.print("Atornillando Board Socket AM4 \n");
    }

    @Override
    public void ponerProcesador() {
        System.out.print("Colocando Procesador AMD  \n");
    }

    @Override
    public void asegurarDisipador() {
        System.out.print("Colocando Back Plate AMD  \nAsegurando Disipador para AMD \n");
    }

    @Override
    public void conectarMemorias() {
        System.out.print("Colocando Memorias  \n");
    }

    @Override
    public void montarTarjetaVideo() {
        System.out.print("Conectando Tarjeta de Video Radeon  \n");
    }

    @Override
    public void conectarFuente() {
        System.out.print("Conectando Fuente de Poder  \n");
    }

    @Override
    public void conectarDiscos() {
        System.out.print("Conectando Disco M.2  \n");
    }
    
}
