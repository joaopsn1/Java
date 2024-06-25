import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        if (A<(B+C) && B<(A+C) && C<(A+B)) {
            double perimetroTriangulo = A+B+C;
            System.out.println("Perimetro = " + perimetroTriangulo);
        } else {
            double areaTrapezio = ((A+B)*C)/2;
            System.out.println("Area = " + areaTrapezio);
        }
    }
}
