import java.util.Scanner;

public class SumOfNaturalNumber{

 public static void main(String[] args){

  Scanner input = new Scanner(System.in);

int sum = 0;

for(int number = 1; number <= 10; number++){

sum += number;
}

System.out.printf("The sum of natural number from 1 to 10 is = %d ", sum);
}

}
