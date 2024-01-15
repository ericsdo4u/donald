public class Arraytota{
public static void main(String[] args){
int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
int total = 0;
System.out.print("the total of ");
for(int counter = 0; counter < array.length; counter++){
	total += array[counter];

System.out.printf("%n%d",array[counter] );
}
System.out.printf("%n is  = %d", total);

}
}