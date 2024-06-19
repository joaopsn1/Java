import java.text.DecimalFormat;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        //Área Triangulo
        double areaTriangulo = A*C/2;
        DecimalFormat df = new DecimalFormat("0.000");
        String trianguloFormatado = df.format(areaTriangulo);
        System.out.println("TRIANGULO: " + trianguloFormatado);

        //Área Circulo
        double PI = 3.14159;
        double areaCirculo = PI*(Math.pow(C,2));
        DecimalFormat cf = new DecimalFormat("0.000");
        String circuloFormatado = cf.format(areaCirculo);
        System.out.println("CIRCULO: " + circuloFormatado);

        //Área Trapezio
        double areaTrapezio = (A+B)*C/2;
        DecimalFormat tf = new DecimalFormat("0.000");
        String trapezioFormatado = tf.format(areaTrapezio);
        System.out.println("TRAPEZIO: " + trapezioFormatado);

        //Área Quadrado
        double areaQuadrado = B*B;
        DecimalFormat qf = new DecimalFormat("0.000");
        String quadradoFormatado = qf.format(areaQuadrado);
        System.out.println("QUADRADO: " + quadradoFormatado);

        //Área Retangulo
        double areaRetangulo = A*B;
        DecimalFormat rf = new DecimalFormat("0.000");
        String retanguloFormatado = rf.format(areaRetangulo);
        System.out.println("RETANGULO: " + retanguloFormatado);
    }
}
