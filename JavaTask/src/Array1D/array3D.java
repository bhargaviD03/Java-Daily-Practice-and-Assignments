package Array1D;
import java.util.Scanner;
public class array3D {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int[][][] marks = new int[2][2][3];

	        for (int i = 0; i < 2; i++) {

	            System.out.println("Department " + (i + 1));

	            for (int j = 0; j < 2; j++) {

	                System.out.println("Class " + (j + 1));

	                for (int k = 0; k < 3; k++) {

	                    System.out.print(
	                        "Student " + (k + 1) + " mark: "
	                    );

	                    marks[i][j][k] = sc.nextInt();
	                }
	            }
	        }

	        int overallHighest = 0;

	        for (int i = 0; i < 2; i++) {

	            int departmentHighest = 0;

	            System.out.println("Department " + (i + 1));

	            for (int j = 0; j < 2; j++) {

	                int total = 0;

	                System.out.println("Class " + (j + 1) + " Marks:");

	                for (int k = 0; k < 3; k++) {

	                    int mark = marks[i][j][k];

	                    System.out.println(
	                        "Student " + (k + 1) + ": " + mark
	                    );

	                    total += mark;

	                    if (mark > departmentHighest) {
	                        departmentHighest = mark;
	                    }

	                    if (mark > overallHighest) {
	                        overallHighest = mark;
	                    }
	                }

	                double average = total / 3.0;

	                System.out.println("Class Average: " + average);
	            }

	            System.out.println(
	                "Department Highest: " + departmentHighest
	            );
	        }

	        System.out.println(
	            "Overall Highest Mark: " + overallHighest
	        );

	        sc.close();
	    }
	}	

	   