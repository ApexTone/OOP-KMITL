/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01_3;

/**
 *
 * @author Predator
 */
public class LinearEquation {
    private double a,b,e,c,d,f;
    private double fraction;

    //Constructor
    public LinearEquation() {
    }
    public LinearEquation(double a, double b, double e, double c, double d, double f) {
        this.a = a;
        this.b = b;
        this.e = e;
        this.c = c;
        this.d = d;
        this.f = f;
    }

    //Setter
    public void setA(double a) {
        this.a = a;
    }
    public void setB(double b) {
        this.b = b;
    }
    public void setC(double c) {
        this.c = c;
    }
    public void setD(double d) {
        this.d = d;
    }
    public void setE(double e) {
        this.e = e;
    }
    public void setF(double f) {
        this.f = f;
    }
    
    //Getter
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public double getD() {
        return d;
    }
    public double getE() {
        return e;
    }
    public double getF() {
        return f;
    }
    
   
    //Method
    public Boolean isSolvable(){
        this.fraction = a*d-b*c;
        if(this.fraction==0){
            System.out.println("The equation has no solution");
            return false;
        }
        else{
            return true;
        }
    }
    public double getX(){
        if(isSolvable()){
            return (e*d-b*f)/fraction;
        }
        else{
            return -1;
        }
    }
    public double getY(){
        if(isSolvable()){
            return (a*f-e*c)/fraction;
        }
        else{
            return -1;
        }
    }
}
