/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torneo;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ismael
 */
public class EquiposTorneo {
    ArrayList<Equipo> equipos;
    
    public EquiposTorneo (){
        equipos = new ArrayList<Equipo>();
    }
    public EquiposTorneo(Equipo e){
        this();
        equipos.add(e);
    }
    public void añadirEquipo(Equipo e){
        equipos.add(e);
    }
    public void eliminarEquipo(int indice){
        equipos.remove(indice);
    }
    public void randomizarEquipos(){
            Collections.shuffle(equipos);
        }
    public Equipo getEquipo(int indice){
        return equipos.get(indice);
    }
    
    public ArrayList<Equipo> getEquipos(){
        return equipos;
    }
    public int getTamaño(){
        return equipos.size();
    }
}
