package academy.devdojo.arrays.unidimensional;

public class IntroducaoArrays {
    public static void main(String[] args) {
        double nota1 = 7.5;
        double nota2 = 8.0;
        double nota3 = 5.2;
        double nota4 = 9.0;
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println(media);
        double[] notas = new double[4];
        notas[0] = 7.6;
        notas[1] = 2.3;
        notas[2] = 4;
        notas[3] = 9;
        System.out.println("Tamanho do array" + notas.length);
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }

    }
}
