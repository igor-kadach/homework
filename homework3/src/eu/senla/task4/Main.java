package eu.senla.task4;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int i;
        int j;

        DecimalFormat format = new DecimalFormat("1.00000");
        String[][] matrix = new String[10][10];
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix.length; j++) {
                Random random = new Random();
                if (j == 0 || j % 2 == 0) {
                    matrix[i][j] = String.valueOf(format.format(random.nextDouble()));
                } else {
                    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
                    String str = "";
                    for (int k = 0; k < 6; k++) {
                        str += alphabet.charAt(random.nextInt(alphabet.length()));
                    }
                    matrix[i][j] = str;
                }
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Main diagonal: ");
        String[] mas1 = new String[10];
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix.length; j++)
                if (i == j) {
                    System.out.print(matrix[i][j] + "\t");
                    mas1[i] = String.valueOf(matrix[i][j]);
                }
        }
        System.out.println();
        System.out.println();
        System.out.println("Secondary diagonal: ");
        String[] mas2 = new String[10];
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix.length; j++)
                if ((i + j) == (matrix.length - 1)) {
                    System.out.print(matrix[i][j] + "\t");
                    mas2[i] = String.valueOf(matrix[i][j]);
                }
        }
        System.out.println();
        for (i = 0; i < mas1.length; i++) {
            if (!mas1[i].equals(mas2[i])) {
                System.out.println();
                System.out.println("Diagonals are not equal!");
                break;
            }
        }
        System.out.println();
        System.out.println("New massive:");
        int count = 0;
        String[] newMas = new String[mas1.length + mas2.length];
        newMas[i] = String.valueOf(mas1.length + mas2.length);
        for (i = 0; i < mas1.length; i++) {
            newMas[i] = mas1[i];
            count++;
        }
        for (j = 0; j < mas2.length; j++) {
            newMas[count++] = mas2[j];
        }
        for (i = 0; i < newMas.length; i++) {
            System.out.print(newMas[i] + "\t");
        }
        System.out.println();
        System.out.println();
        String[] letMas = new String[10];
        double[] numMas = new double[10];
        int numbersCounter = 0;
        int stringsCounter = 0;
        for (i = 0; i < newMas.length; i++) {
            try {
                numMas[numbersCounter] = Double.parseDouble(newMas[i].replace(',', '.'));
                numbersCounter++;
            } catch (NumberFormatException e) {
                letMas[stringsCounter] = newMas[i];
                stringsCounter++;
            }
        }
        System.out.println("Array of numbers:");
        for (i = 0; i < numMas.length; i++) {
            System.out.print(numMas[i] + "\t");
        }
        System.out.println();
        System.out.println();
        System.out.println("Array of strings:");
        for (i = 0; i < letMas.length; i++) {
            System.out.print(letMas[i] + "\t");
        }
        System.out.println();
        System.out.println();
        Double[] roundMas = new Double[numMas.length];
        System.out.println("Rounding array:");
        for (i = 0; i < numMas.length; i++) {
            if (numMas[i] > 1.70000) {
                roundMas[i] = Double.valueOf(Math.round(numMas[i]));
            } else {
                roundMas[i] = Double.valueOf(Math.floor(numMas[i]));
            }
            System.out.print(roundMas[i] + " _ ");
        }
        System.out.println();
        System.out.println();
        System.out.println("2-4 char array:");
        StringBuilder sb = new StringBuilder();
        for (i = 0; i < letMas.length; i++) {
            sb.append(letMas[i].substring(1,4));
            sb.append(',');
        }
        System.out.println(sb);
    }

}



