public class SumOfColumn {
public static void main(String[] args) {

int[][] matrix = { {5, 7, 8}, {4, 2, 4}, {7, 3, 2} };

for (int column = 0; column < matrix[0].length; column++) {
int total = 0;
for (int row = 0; row < matrix.length; row++)




 total += matrix[row][column];
 System.out.println(" Sum for matrix "  + column  + " is " + total);

}

}
}