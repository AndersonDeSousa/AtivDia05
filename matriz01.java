//Criando matriz e recebendo valores aleatorios com a classe random
import java.util.Random;

public class matriz01 {

    public static void main(String[] args) {
        Random num = new Random();
        int matriz[][] = new int[5][3];
        for (int L = 0; L < matriz.length; L++) {
            for (int C = 0; C < matriz[0].length; C++) {
                matriz[L][C] = num.nextInt(51);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
