package org.example;

public class Elipse extends FigurasGeometricas {
    private double semiejeMayor;
    private double semiejeMenor;
    public Elipse(String nombre, double ejeMayor, double ejeMenor) {
        this.semiejeMayor = ejeMayor/2;
        this.semiejeMenor = ejeMenor/2;
    }
    public double getSemiejeMayor() {
        return semiejeMayor;
    }
    public void setSemiejeMayor(double semiejeMayor) {
        this.semiejeMayor = semiejeMayor;
    }
    public double getSemiejeMenor() {
        return semiejeMenor;
    }
    public void setSemiejeMenor(double semiejeMenor) {
        this.semiejeMenor = semiejeMenor;
    }
    @Override
    public double area() {
        return Math.PI * semiejeMayor * semiejeMenor;
    }
}
