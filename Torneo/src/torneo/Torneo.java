/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torneo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ismael
 */
public class Torneo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EquiposTorneo equipos = new EquiposTorneo();
        Scanner teclado = new Scanner(System.in);
        int numEquipos;
        
        do{
        System.out.print("Introduce el numero de equipos de entre 6 y 12 equipos: ");
        numEquipos = teclado.nextInt();
        }while(numEquipos >= 6 && numEquipos <= 12);
        for(int i = 0; i<=numEquipos; i++){
            equipos.añadirEquipo(new Equipo("Equipo "+ (char) ('A' + i)));
        }
        
        
    }
    
}
