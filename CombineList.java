import java.util.Arrays;

public class CombineList {

	public static void main(String[] args){

	int[] arrayOfIntegers = {1,2,3};

	String[] arrayOfStrings = {"a", "b", "c"};

	String[] newArray = CombineList.combineList(arrayOfStrings, arrayOfIntegers);

	System.out.print(Arrays.toString(newArray));


}



	public static String[] combineList(String[] arrayOfStrings, int[] arrayOfIntegers) {

	String[] newArray = new String[arrayOfStrings.length + arrayOfIntegers.length];

	int index1 = 0;

	int index2 = 1;

	for(int count = 0; count < arrayOfIntegers.length;  count++){
		
		newArray[index1] = arrayOfStrings[count];
		newArray[index2] = String.valueOf(arrayOfIntegers[count]);

		index1 += 2;
		index2 += 2; 		

	} 

	return newArray;

	}

}