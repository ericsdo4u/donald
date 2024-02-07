//import java.util.Arrays;
public class TestArrayMethod2{

public static void main(String[] args){

int[] myArray = {1, 2, 3, 4, 5};

//for(int value : myArray){

//System.out.printf("%d ", value);

modifyArray(myArray);


//}
}
public static void modifyArray(int[] number){

//int [] newNumber = new int [number.length];

for(int counter = 0; counter < number.length; counter++){

	number[counter] *= 2;

System.out.printf(" %d ", number[counter]);
}


}
}