package org.example;

public class Circulo extends FigurasGeometricas implements Drawable{
    private double radio;

    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
   
    @Override
    public double area() {
        return Math.PI * radio * radio;
    }
    @Override
    public void draw() {
        System.out.println("Dibujando un circulo");
    }
    
}