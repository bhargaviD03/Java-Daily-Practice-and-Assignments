package Array1D;
import java.util.Scanner;

public class array1D {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] marks = new int[10];

        int highest = 0;
        int lowest = 100;
        int total = 0;
        int pass = 0;
        int fail = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter mark of student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();

            total += marks[i];

            if (marks[i] > highest) {
                highest = marks[i];
            }

            if (marks[i] < lowest) {
                lowest = marks[i];
            }

            if (marks[i] >= 35) {
                pass++;
            } else {
                fail++;
            }
        }

        System.out.println("Student Marks:");

        for (int i = 0; i < 10; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }

        double average = total / 10.0;

        System.out.println("Highest Mark: " + highest);
        System.out.println("Lowest Mark: " + lowest);
        System.out.println("Average: " + average);
        System.out.println("Passed Students: " + pass);
        System.out.println("Failed Students: " + fail);

        sc.close();
    }
}