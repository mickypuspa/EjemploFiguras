import java.util.Arrays;

public class GestorFigurasTest {
    public static void main (String[] args){
        Figura[] figuras = new Figura[4];
        figuras[0] = new Circulo(5.5);
        figuras[1] = new Rectangulo(2,4);
        figuras[2] = new Triangulo(3,4);
        figuras[3] = new Cuadrado(5);

        GestorFiguras g = new GestorFiguras();
        double total = g.Suma(figuras);
        System.out.println("La suma total es: " + total);
    }

}
