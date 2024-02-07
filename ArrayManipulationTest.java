public class ArrayManipulationTest{

public static void main(String[] args){

final int ARRAY_LENGTH = 10;

int[] testArray = new int[ARRAY_LENGTH];

System.out.printf("%s%10s%n ", "Index","Value");

for(int counter = 0; counter < testArray.length; counter++){

testArray[counter] = 2 + 2 * counter;

System.out.printf("%d%10d%n ",counter, testArray[counter]);

}
}
}