public class ArrayManipulationTest2{

public static void main(String[] args){

int[] testArray2 = {8, 23, 12, 9, 6, 34, 12, 23, 14, 35};

int total = 0;

double average = 0;

for(int counter = 0; counter < testArray2.length; counter++){

total += testArray2[counter];

}
System.out.println("the length is " + testArray2.length);

average = total / 2;

System.out.printf("total is %d%n and the average is %.2f%n ", total, average);


}
}