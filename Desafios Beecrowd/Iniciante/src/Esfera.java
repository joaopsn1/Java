import java.text.DecimalFormat;
import java.util.Scanner;

public class Esfera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double PI = 3.14159;
        double R = scanner.nextDouble();
        double volume = (4.0/3)*PI*(Math.pow(R,3));

        DecimalFormat df = new DecimalFormat("0.000");
        String volumeFormatado = df.format(volume);

        System.out.println("VOLUME = " + volumeFormatado);
    }
}
