import java.util.Arrays;
public class TestArrayMethod{

public static void main(String[] args){

int[] myArray = {1, 2, 3, 4, 5};

System.out.print(Arrays.toString(modifyArray(myArray)));


}




public static int[] modifyArray(int[] number){
int [] newNumber = new int [number.length];
for(int counter = 0; counter < number.length; counter++){
	newNumber[counter] = number[counter] * 2;

}
return newNumber;
}

}