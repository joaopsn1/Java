import java.text.DecimalFormat;
import java.util.Scanner;

public class Media1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double pesoA = 3.5;
        double B = scanner.nextDouble();
        double pesoB = 7.5;
        double MEDIA = (A * pesoA + B * pesoB)/(pesoA + pesoB);

        DecimalFormat df = new DecimalFormat("0.00000");
        String mediaFormatada = df.format(MEDIA);

        System.out.println("MEDIA = " + mediaFormatada);
    }
}
