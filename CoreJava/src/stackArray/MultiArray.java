package stackArray;

import java.util.Scanner;

public class MultiArray {
	
		public void array3D() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number of blocks needed: ");
			int Matrix = sc.nextInt();
			
			String[][][] arr = new String[Matrix][][];
			
			for(int i=0;i<arr.length;i++) {
				System.out.println("Matrix:" + i);
				System.out.println("Enter the number of rows needed: ");
				int row = sc.nextInt();
				System.out.println("Enter the number of columns needed: ");
				int column = sc.nextInt();
				 sc.nextLine();
				arr[i]= new String[row][column];
			}
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					for(int k=0;k<arr[i][j].length;k++) {
				System.out.println("block:"+ i+"row:"+j+",column:"+k);
				arr[i][j][k] = sc.nextLine();
				 
					}
				}
			}
			
			System.out.println("Elements in multi array");
			
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr[i].length;j++) {
					for(int k=0;k<arr[i][j].length;k++) {
					System.out.print(arr[i][j][k] + " ");
					}
					System.out.println();
				}
			}
			sc.close();
			
		}
		
		public void key() {
			int[] arr = {10,20,30,40,50};
			int[] key = {40};
			System.out.println("Array:");
			for(int i=0;i<arr.length;i++) {
				System.out.println(+arr[i]);
			}
			for(int i=0;i<arr.length;i++){
				if(key[0]==arr[i]) {
					System.out.print("The index value of a number is:"+i);
				}
				System.out.println();
			}
		}

		
	public static void main(String[] args) {
		MultiArray A = new MultiArray();
//		A.array3D();
		A.key();
		
		
		
		
//		int [][][] multiarray = {{{10,20,30},{40,50,60},{70,80,90}},{{1,2},{3,4},{5,6}}};
//		System.out.println(multiarray[0][0][0]);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of block :");
		int block=sc.nextInt();
		//block row and column [][][]
		int [][][] multiarray = new int[block][][];
		
		for(int i=0;i<multiarray.length;i++) {
			System.out.println("matrix"+ i);
			System.out.println("Enter the number of rows :");
			int row =sc.nextInt();
			System.out.println("Enter the index of columns:" );
			int column =sc.nextInt();
			multiarray[i] = new int[row][column];
		}

		for(int i=0;i<multiarray.length;i++) {
			for(int j=0;j<multiarray[i].length;j++) {
				for(int k=0;k<multiarray[i][j].length;k++) {
			System.out.println("block:"+ i+"row:"+j+",column:"+k);
			multiarray[i][j][k] = sc.nextInt();
				}
			}
		}
		
		System.out.println("Elements in multi array");
		
		for(int i=0;i<multiarray.length;i++) {
			for(int j=0;j<multiarray[i].length;j++) {
				for(int k=0;k<multiarray[i][j].length;k++) {
				System.out.print(multiarray[i][j][k] + " ");
				}
				System.out.println();
			}
		}
		sc.close();
	}

}
