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
public abstract class Computador {
    
    public void armarComputador(){
    
        atornillarBoard();
        ponerProcesador();
        asegurarDisipador();
        conectarMemorias();
        montarTarjetaVideo();
        conectarFuente();
        conectarDiscos();
        
    }
    
    public abstract void atornillarBoard();
    public abstract void ponerProcesador();
    public abstract void asegurarDisipador();
    public abstract void conectarMemorias();
    public abstract void montarTarjetaVideo();
    public abstract void conectarFuente();
    public abstract void conectarDiscos();
    
    
}
