package fireDrillTwo;

import java.util.Scanner;

public class TaskThree {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input ten integer to sum them: ");
        int scores = input.nextInt();

        int sum = 0;

        double average = 0;

        for(int count = 1; count <= 10; count++){

            System.out.print("Input ten integer to sum them: ");
            scores = input.nextInt();

            sum += scores;
            average = sum / count;

        }
        System.out.printf("Sum is %d%n Average is %.0f ", sum, average);

    }


}
