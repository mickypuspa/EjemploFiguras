public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo(double b, double a) {
        this.base = b;
        this.altura = a;
    }

    @Override
    public double area() {
        return (base*altura)/2;
    }
}
