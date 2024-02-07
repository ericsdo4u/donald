public class ArrayTest{

public static void main(String[] args){

String[] testArray = new String[12];

System.out.printf("%s%10s%n ", "Index","Value");
for(int counter = 0; counter < testArray.length; counter++){

System.out.printf("%d%10s%n ",counter, testArray[counter]);

}
}
}