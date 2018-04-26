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

    public Ronda() {
        numRonda = 1;
    }

    public Ronda(EquiposTorneo eq) {
        equipos = eq;
        numRonda = 1;
    }

    public void mostrarEquipos() {
        for (Equipo e : equipos.getEquipos()) {
            tabular();
            System.out.print(e.toString());
        }
        System.out.println();
    }

    private void tabular() {
        for (int i = 1; i <= numRonda; i++) {
            System.out.print("\t");
        }
    }
    
    private void mostrarLineaVertical(){
        
    }

    public void mostrarGanadores() {
        if (equipos.getTamaño() % 2 == 0) {
            mostrarEquipos();
        } else {
            for (int i = 0; i < equipos.getTamaño() - 1; i++) {
                tabular();
                System.out.print(equipos.toString());
            }
            tabular();
            System.out.println();
        }
    }
}
