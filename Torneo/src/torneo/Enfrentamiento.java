/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torneo;

/**
 *
 * @author ismael
 */
public class Enfrentamiento {
    private Equipo e1;
    private Equipo e2;
    private int res1,res2;
    
    public Enfrentamiento(){
        
    }
    
    public Enfrentamiento(Equipo e1, Equipo e2){
        this.e1 = e1;
        this.e2 = e2;
        res1 = calcularResultado();
        res2 = calcularResultado();
    }
    private int calcularResultado(){
        return (int) (Math.random() * 5) + 1;
    }

    public int getRes1() {
        return res1;
    }

    public int getRes2() {
        return res2;
    }
    public Equipo getGanador(){
        if(res1>= res2){
            return e1;
        }else{
            return e2;
        }
    }
    
}
