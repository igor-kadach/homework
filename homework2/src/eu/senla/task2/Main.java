package eu.senla.task2;

import eu.senla.task2raduga.Rainbow;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number in this format '1' or '11' (numbers from 1 to 7): ");
        String a = input.nextLine();
        int firstNumber = Integer.parseInt(a.substring(0, 1));
        if (a.length() == 1) {
            System.out.println(getColor(firstNumber));
        } else if (a.length() > 1) {
            int secondNumber = Integer.parseInt(a.substring(1, 2));
            System.out.println(getColor(firstNumber) + "-" + getColor(secondNumber));
        }
    }
    public static String getColor(int number) {
        switch (number) {
            case 1:
                return Rainbow.red;
            case 2:
                return Rainbow.orange;
            case 3:
                return Rainbow.yellow;
            case 4:
                return Rainbow.green;
            case 5:
                return Rainbow.lightBlue;
            case 6:
                return Rainbow.blue;
            case 7:
                return Rainbow.purple;
            default:
                return "";
        }
    }
}