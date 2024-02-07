public class ArrayInitializerTest{

public static void main(String[] args){

int[] testArray = {42, 76, 23, 2, 45, 7, 4, 63, 9};

System.out.printf("%s%10s%n ", "Index","Value");
for(int counter = 0; counter < testArray.length; counter++){

System.out.printf("%d%10d%n ",counter, testArray[counter]);

}
}
}