package fireDrillOne;

public class FireFive {
        public static void main(String[] args) {

        for (int count = 1; count <= 10; count++) {

                if (count % 4 == 0) {

                    for (int innercount = 1; innercount <= 5; innercount++) {

                        System.out.print(count +" ");

                    }
                    System.out.print(" ");
                }

            }

        }
    }