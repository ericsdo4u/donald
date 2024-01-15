import java.util.Arrays;

public class ConcatenateList {

	public static void main(String[] args){

	int[] arrayOfIntegers = {1,2,3};

	String[] arrayOfStrings = {"a", "b", "c"};

	ConcatenateList newList = new ConcatenateList();
	

	String[] newArray = newList.concatenateList(arrayOfStrings, arrayOfIntegers);

	System.out.print(Arrays.toString(newArray));


}



	public String[] concatenateList(String[] arrayOfStrings, int[] arrayOfIntegers) {

	String[] newArray = new String[arrayOfStrings.length + arrayOfIntegers.length];

	for(int count = 0; count < arrayOfIntegers.length;  count++){

		newArray[count] = String.valueOf(arrayOfIntegers[count]); 

	} 

	int index = arrayOfStrings.length;

	for(int count = 0; count < arrayOfStrings.length; count++) {

		newArray[index] = arrayOfStrings[count];

		index++;

	}

	return newArray;

	}

}