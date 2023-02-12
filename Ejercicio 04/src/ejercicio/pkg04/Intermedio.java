/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg04;

/**
 *
 * @author Alejandro
 */
public class Intermedio {
    private int numero1;
    private int numero2;
    private int numero3;

    public Intermedio(int numero1, int numero2, int numero3) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = numero3;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getNumero3() {
        return numero3;
    }

    public void setNumero3(int numero3) {
        this.numero3 = numero3;
    }

    @Override
    public String toString() {
        return "Intermedio{" + "numero1=" + numero1 + ", numero2=" + numero2 + ", numero3=" + numero3 + '}';
    }
    
    public int CalcularNumeroIntermedio(){
        int max;
        max = numero1;
        
        if(numero2>max)
            max = numero2;
        if(numero3>max)
            max = numero3;
        
        if(max==numero1)
            if(numero2>numero3)
                return numero2;
            else
                return numero3;
        if(max==numero2)
            if(numero1>numero3)
                return numero1;
            else
                return numero3;
        if(max==numero3)
            if(numero1>numero2)
                return numero1;
            else
                return numero2;
        else
            return 0;
   }
}
