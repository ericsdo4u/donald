public class ArrayManipulationTest3{

public static void main(String[] args){

int[] testArray2 = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};

System.out.println("Grade distribution");


for(int counter = 0; counter < testArray2.length; counter++){

if(counter == 10) {
System.out.printf("%5d: ", 100);
}
else{
	System.out.printf("%02d-%02d: ", counter * 10, counter * 10 + 9);

}

for(int counter2 = 0; counter2 < testArray2[counter]; counter2++){
System.out.print("*");

}
System.out.println();
}
}
}