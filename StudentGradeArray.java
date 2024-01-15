import java.util.Scanner;

public class StudentGradeArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many student do you have: ");
        int numberOfStudents = input.nextInt();

	System.out.println("How many subject do you offer: ");
        int numberOfSubject = input.nextInt();

	int[][] studentScores = new int[numberOfStudents][numberOfSubject];


        int studentTotalScores = 0;
	double studentAverage = 0;

        for (int num = 0; num <= numberOfStudents; num++) {
            System.out.println("Entering score for student " + (num + 1) + ": ");

	
	for (int numm = 0; num <= numberOfSubject; numm++) {
            System.out.println("Enter score for subject " + (numm + 1) + ": ");
            studentScores[numm] = input.nextInt();
	
	studentTotalScores += numm;
      
	  }
	
        }
        
        
        

        for (int scores : studentScores) {
            char grade = calculateGrade(scores);
            System.out.println("Student with marks " + scores + " gets grade: " + grade);
        }
    }

    public static char calculateGrade(int scores) {
        if (scores >= 90) {
            return 'A';
        } else if (scores >= 80) {
            return 'B';
        } else if (scores >= 70) {
            return 'C';
        } else if (scores >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}