/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg03;

/**
 *
 * @author Alejandro
 */
public class Interes {
    private double capital;

    public Interes(double capital) {
        this.capital = capital;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "Interes{" + "capital=" + capital + '}';
    }
    
    public double CalcularTaza(){
        if(capital<500)
            return 2;
        else
            if(capital<=1500)
                return 4.5;
            else
                return 9;
    }
    
    public double CalcularInteres(){
        return capital * CalcularTaza() / 1200;
    }
    
}
