package academy.devdojo.arrays.unidimensional;

import java.util.Scanner;

public class ArraysMelhorado {

    public static void main(String[] args) {
        int[] v1 = new int[3];
        int[] v2 = new int [3];
        int[] v3 = new int[3];

        Scanner scanner = new Scanner(System.in);
        String v3Multiplicado = " ";
        for(int i = 0; i < v1.length; i++) {
            System.out.println("Vetor 1, Posição:" + i + ": ");
            v1[i] = scanner.nextInt();
            System.out.println("Vetor 2, Posição:" + i + ": ");
            v2[i] = scanner.nextInt();
            v3[i] = v1[i] * v2[i];
            v3Multiplicado = v3Multiplicado + v3[i];
        }

        System.out.println(v3Multiplicado);
    }
}
