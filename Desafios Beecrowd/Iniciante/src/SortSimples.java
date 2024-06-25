import java.util.Scanner;

public class SortSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N1 = scanner.nextInt();
        int N2 = scanner.nextInt();
        int N3 = scanner.nextInt();
        //Armazenar numeros originais
        int [] numerosOriginais = {N1, N2, N3};
        //Ordenar os numeros
        int [] numerosOrdenados = {N1, N2, N3};
        ordenar(numerosOrdenados);
        //Imprimir numeros ordenados
        System.out.println(numerosOrdenados[0]);
        System.out.println(numerosOrdenados[1]);
        System.out.println(numerosOrdenados[2]);

        System.out.println();

        //Imprimir numeros na ordem original
        System.out.println(numerosOriginais[0]);
        System.out.println(numerosOriginais[1]);
        System.out.println(numerosOriginais[2]);
    }
    //Metodo para ordenar array de três numeros
    private static void ordenar(int[] numerosOrdenados) {
        for (int i = 0; i < numerosOrdenados.length - 1; i++) {
            for (int j = i + 1; j < numerosOrdenados.length; j++) {
                if (numerosOrdenados[i] > numerosOrdenados[j]){
                    int temp = numerosOrdenados[i];
                    numerosOrdenados[i] = numerosOrdenados[j];
                    numerosOrdenados[j] = temp;
                }
            }
        }
    }
}
