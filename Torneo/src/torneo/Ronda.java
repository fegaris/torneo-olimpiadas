/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torneo;

/**
 *
 * @author Ismael
 */
public class Ronda {
    private EquiposTorneo equipos;
    private int numRonda;
    
    public Ronda(){
        numRonda = 1;
    }
    public Ronda(EquiposTorneo eq){
        equipos = eq;
        numRonda = 1;
    }
    public void mostrarEquipos(){
        for(Equipo e : equipos.getEquipos()){
            System.out.print(e.toString());
        }
    }
    
}
