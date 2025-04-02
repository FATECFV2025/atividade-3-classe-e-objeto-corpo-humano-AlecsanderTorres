package main.java;

public class CorpoHumano {
    private double Massa;
    private double Altura;

    public CorpoHumano() {
    }

    public CorpoHumano(double Massa, double Altura) {
        this.Massa = Massa;
        this.Altura = Altura;
    }

    

    public void setAltura(double altura) {
        this.Altura = altura;
    }

    public void setMassa(double massa) {
        this.Massa = massa;
    }

    public double calcularIMC() {
        if (Altura <= 0) {
            return 0;
        }
        return Massa / (Altura * Altura);
    }
}