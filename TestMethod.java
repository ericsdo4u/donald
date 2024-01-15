public class TestMethod{

public static void nPrintln(String message, int n) {
for (int i = 0; i < n; i++)
 System.out.println(message);
}

public static void main(String[] args){

String a = "Hello world";
int b = 3;

nPrintln(a, b);
}
}