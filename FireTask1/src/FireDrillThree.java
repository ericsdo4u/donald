
public class FireDrillThree {


    public int[] taskOne() {

       int[] scores = {4, 7, 8, 4, 3, 2, 7, 1, 9, 4};

return scores;
    }

    public static void taskTwo() {

        //int[] scores = new int[10];
        int[] scores = {4, 7, 8, 4, 3, 2, 7, 1, 9, 4};
        for (int score : scores) {
            System.out.print(score + " ");

        }


    }


    public static void taskThree() {

        // int[] scores = new int[10];

        int[] scores = {4, 7, 8, 4, 3, 2, 7, 1, 9, 4};

        for (int score : scores) {
            System.out.println(+score);


        }

    }

    public static void taskFour(int[] number) {

        int[] scores = {4, 7, 8, 4, 3, 2, 7, 1, 9, 4};

        for (int count = 0; count <= scores.length; count += 2) {

            System.out.print(scores[count]);


        }


    }


    public static void taskFive(int[] number) {

        int[] scores = {4, 7, 8, 4, 3, 2, 7, 1, 9, 4};

        for (int count = 1; count <= scores.length; count += 2) {

            System.out.print(scores[count]);


        }


    }

    public static void taskSix(int[] number) {
        int[] scores = {4, 7, 8, 4, 3, 2, 7, 1, 9, 4};
        for (int count = 0; count <= scores.length; count += 2) {
            int total = 0;

            int sum = scores[count];
            total += sum;
            System.out.print(total);


        }


    }

    public static void taskSeven(int[] number) {

        int[] scores = {4, 7, 8, 4, 3, 2, 7, 1, 9, 4};

        for (int count = 1; count <= scores.length; count += 2) {

            System.out.print(scores[count]);
            int total = 0;

            int sum = number[count];
            total += sum;
            System.out.print(total);


        }
    }

    public static void taskEight(int[] number) {

        int[] scores = {4, 7, 8, 4, 3, 2, 7, 1, 9, 4};

        int minimum = 0;

        for (int count1 = 0; count1 <= scores.length; count1 += 2) {
            if (scores[count1] < minimum) {
                minimum = scores[count1];


                // System.out.print(number[count]);


            }
        }

    }

    public static void taskNine() {

        int[] scores = {4, 7, 8, 4, 3, 2, 7, 1, 9, 4};

        int minimum = 0;

        for (int count = 1; count <= scores.length; count += 2) {

            if (scores[count] < minimum) {
                minimum = scores[count];

                //System.out.print(scores[count]);

            }
        }

    }

    public static void taskTen() {

        int[] scores = {4, 7, 8, 4, 3, 2, 7, 1, 9, 4};

        int maximum = 0;

        for (int count1 = 0; count1 <= scores.length; count1 += 2) {
            if (scores[count1] > maximum) {
                maximum = scores[count1];

            }
        }

    }

    public static void taskEleven() {


        int[] scores = {4, 7, 8, 4, 3, 2, 7, 1, 9, 4};

        int maximum = 0;

        for (int count = 1; count <= scores.length; count += 2) {

            if (scores[count] > maximum) {
                maximum = scores[count];


            }
        }
    }
}
