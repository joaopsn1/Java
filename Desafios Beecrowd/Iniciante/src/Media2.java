import java.text.DecimalFormat;
import java.util.Scanner;

public class Media2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double pesoA = 2.0;
        double B = scanner.nextDouble();
        double pesoB = 3.0;
        double C = scanner.nextDouble();
        double pesoC = 5.0;
        double media = (A*pesoA + B*pesoB + C*pesoC)/(pesoA + pesoB + pesoC);

        DecimalFormat df = new DecimalFormat("0.0");
        String mediaFormatada = df.format(media);

        System.out.println("MEDIA = " + mediaFormatada);
    }
}
