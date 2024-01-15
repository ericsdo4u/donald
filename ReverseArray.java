public class ReverseArray{
public static void main(String[] args){

int[] list = {1, 2, 3, 4, 5, 6, 7};
  reverse(list);
for (int i = 0; i < list.length; i++)
System.out.print(list[i] + " ");
}

public static void reverse(int[] list){
int[] result = new int[list.length];

for(int i = 0; i < list.length; i++)
result[i] = list[list.length - 1 - i];
list = result;

}


}
