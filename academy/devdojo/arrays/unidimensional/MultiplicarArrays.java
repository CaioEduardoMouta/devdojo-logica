package academy.devdojo.arrays.unidimensional;

import java.util.Scanner;

public class MultiplicarArrays {
    public static void main(String[] args) {
        int[] v1 = new int[3];
        int[] v2 = new int [3];
        int[] v3 = new int[3];

        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < v1.length; i++) {
            System.out.println("Vetor 1, Posição:" + i + ": ");
            v1[i] = scanner.nextInt();

        }
        for(int i = 0; i < v2.length; i++) {
            System.out.println("Vetor 1, Posição:" + i + ": ");
            v2[i] = scanner.nextInt();
        }
        for(int i = 0; i < v3.length; i++) {
            v3[i] = v1[i] * v2[i];
            System.out.println(v3[i] + " ");
        }
    }
}
