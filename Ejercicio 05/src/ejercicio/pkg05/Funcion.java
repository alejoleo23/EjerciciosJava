/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg05;

/**
 *
 * @author Alejandro
 */
public class Funcion {
    private double x;

    public Funcion(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Funcion{" + "x=" + x + '}';
    }
    
    public double CalcularF(){
        if(x<0)
            return Math.pow(x, 3) + x / 2;
        else
            return 4 * Math.pow(x, 2) - 2;
    }
    
}
