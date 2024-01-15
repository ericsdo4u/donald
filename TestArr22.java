public class TestArr22 {
public static void main(String[] args) {
 double[] array = new double[10];
array[9] = 5.5;
double total = 0;
System.out.printf("%s\t%s%n", "index","value");
 for (int i = 0; i < array.length; i++){
total += array[i];
 
System.out.printf("%d\t%1f%n",i , array[i]);
}
System.out.printf("this is the total %n%1f", total);
 }
 }