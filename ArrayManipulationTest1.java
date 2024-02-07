public class ArrayManipulationTest1{

public static void main(String[] args){

int[] testArray2 = {34, 76, 8, 23, 12, 9, 56, 6};

System.out.printf("%s%10s%n ", "Index","Value");

for(int counter = 0; counter < testArray2.length; counter++){

System.out.printf("%d%10d%n ",counter, testArray2[counter]);

}
}
}