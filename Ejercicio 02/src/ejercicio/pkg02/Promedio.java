/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg02;

/**
 *
 * @author Alejandro
 */
public class Promedio {
    private double nota1;
    private double nota2;

    public Promedio(double nota1, double nota2) {
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    @Override
    public String toString() {
        return "Promedio{" + "nota1=" + nota1 + ", nota2=" + nota2 + '}';
    }
    
    public double CalcularPromedio(){
        return (nota1 + nota2)/2;
    }
    
    public boolean EstaAprobado(){
        if(CalcularPromedio()>=10.5)
            return true;
        else
            return false;
    }  
    
}
