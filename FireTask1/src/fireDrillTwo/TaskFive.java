package fireDrillTwo;

import java.util.Scanner;

public class TaskFive {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input ten integer to sum them: ");
        int scores = input.nextInt();

        int sum = 0;

        for(int count = scores; count <= 10; count+=2){

                sum += count;


        }
        System.out.printf("Sum of the even numbers is %d%n ", sum);

    }


}

