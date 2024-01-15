public class ReverseArray2{
public static void main(String[] args){

int[] list1 = {1, 2, 3, 4, 5};
int[] list2 = new int[list1.length];

for (int i = 0, j = list2.length - 1; i < list1.length; i++, j--) {

int temp = list1[i];
 list1[i] = list2[j];
 list2[j] = temp;
System.out.printf("%d", j);
}
}
}