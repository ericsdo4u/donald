public class SumAll{
public static void main(String[] args){

int[][] matrix = { {5, 7, 4}, {9, 5, 2}, {6, 1, 3} };

int total = 0;
for (int row = 0; row < matrix.length; row++) {
for (int column = 0; column < matrix[row].length; column++) {
 total += matrix[row][column];

 }

}
System.out.print("The sum is " + total);
}
}