public class Rectangulo extends Figura{
    private double base;
    private double altura;

    public Rectangulo (double b, double a){
        this.base = b;
        this.altura = a;
    }


    @Override
    public double area() {
        return base*altura;
    }
}
