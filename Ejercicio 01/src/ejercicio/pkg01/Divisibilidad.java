/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg01;

/**
 *
 * @author Alejandro
 */
public class Divisibilidad {
        private int numeroA;
        private int numeroB;

    public Divisibilidad(int numeroA, int numeroB) {
        this.numeroA = numeroA;
        this.numeroB = numeroB;
    }

    public int getNumeroA() {
        return numeroA;
    }

    public void setNumeroA(int numeroA) {
        this.numeroA = numeroA;
    }

    public int getNumeroB() {
        return numeroB;
    }

    public void setNumeroB(int numeroB) {
        this.numeroB = numeroB;
    }

    @Override
    public String toString() {
        return "Divisibilidad{" + "numeroA=" + numeroA + ", numeroB=" + numeroB + '}';
    }
        
    public boolean EsDivisible(){
        if(numeroA%numeroB==0)
            return true;
        else
            return false;
    }
        
}
