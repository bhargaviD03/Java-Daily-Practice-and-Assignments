package stackArray;
import java.util.Scanner;
public class Array2D {

	
	public void arr2d() {
		int [][] arr = {{1,2,3},{10,20,30},{100,200,300}};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
			System.out.println("row:"+i+",column:"+j+",arr:"+arr[i][j]);
		}
		}
		
	}
	public void arr2dfromusers() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of rows :");
		int Rows =sc.nextInt();
		System.out.println("Enter the index of columns:" );
		int Columns =sc.nextInt();
		
		
		int[][] arr = new int[Rows][Columns];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
			System.out.println("row:"+i+",column:"+j);
			arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Elements in 2d array");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
			System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Array2D A = new Array2D();
		A.arr2d();
		A.arr2dfromusers();

	}

}
