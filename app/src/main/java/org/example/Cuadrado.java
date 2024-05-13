package org.example;

public class Cuadrado extends FigurasGeometricas implements Drawable{
    private double lado;
    
    public Cuadrado() {
        super();
    }
    
    public Cuadrado(Double lado) {
        super();
        this.lado = lado;
    }  
    
    public Cuadrado(String nombre, double lado) {
        super(nombre);
        this.lado = lado;
    }
    
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    @Override 
    public double area() {
        return lado * lado;
    }

    @Override
    public void draw() {
        System.out.println("Dibujando un cuadrado");
    }
}
