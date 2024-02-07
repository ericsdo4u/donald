package fireDrillTwo;

import java.util.Scanner;

public class TaskFour {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input the length of numbers to calculate: ");
        int scores = input.nextInt();

        int sum = 0;
        for(int count = scores; count <= 10; count+=2){

            System.out.print("Input numbers: ");
            scores = input.nextInt();

            sum += count;

        }
        System.out.printf("Sum is %d ", sum);

    }


}
