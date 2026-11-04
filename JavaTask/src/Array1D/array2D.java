package Array1D;
import java.util.Scanner;

public class array2D {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] marks = new int[3][4];

        int overallHighest = 0;
        int topperClass = 0;
        int topperStudent = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter marks for Class " + (i + 1));

            for (int j = 0; j < 4; j++) {
                System.out.print("Student " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {

            int total = 0;
            int highest = 0;

            System.out.println("Class " + (i + 1) + " Marks:");

            for (int j = 0; j < 4; j++) {

                System.out.println(
                    "Student " + (j + 1) + ": " + marks[i][j]
                );

                total += marks[i][j];

                if (marks[i][j] > highest) {
                    highest = marks[i][j];
                }

                if (marks[i][j] > overallHighest) {
                    overallHighest = marks[i][j];
                    topperClass = i + 1;
                    topperStudent = j + 1;
                }
            }

            System.out.println("Class Total: " + total);
            System.out.println("Class Highest: " + highest);
        }

        System.out.println("Overall Topper:");
        System.out.println("Class: " + topperClass);
        System.out.println("Student: " + topperStudent);
        System.out.println("Highest Mark: " + overallHighest);

        sc.close();
    }
}