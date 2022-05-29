package academy.DArray;

public class Test02 {
	
	// 출력 함수
	public static void print2DArray(int[][] array) {
	for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array[i].length; j++) {
			System.out.print(array[i][j] + " ");
		}
		System.out.println();
	}
	System.out.println();
	}

	public static void main(String[] args) {
		
		System.out.println("1. 10 입력하기");
		int[][] array1 = new int[2][3];
		
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				array1[i][j] = 10;
			}
		}
// 		for (int i = 0; i < array1.length; i++) {
// 			for (int j = 0; j < array1[i].length; j++) {
// 				System.out.print(array1[i][j] + " ");
// 			}
// 			System.out.println();
// 		}
// 		System.out.println();
		print2DArray(array1);
		
		
		System.out.println("2. 순서대로 입력하기");
		int[][] array2 = new int[3][4];
		
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				array2[i][j] = j + 1;
			}
		}
		
// 		for (int i = 0; i < array2.length; i++) {
// 			for (int j = 0; j < array2[i].length; j++) {
// 				System.out.print(array2[i][j] + " ");
// 			}
// 			System.out.println();
// 		}
// 		System.out.println();
		print2DArray(array2);
		
		
		System.out.println("3. 배열 별로 입력하기");
		int[][] array3 = new int[3][3];
		
		for (int i = 0; i < array3.length; i++) {
			for (int j = 0; j < array3[i].length; j++) {
				array3[i][j] = i + 1;
			}
		}
		
// 		for (int i = 0; i < array3.length; i++) {
// 			for (int j = 0; j < array3[i].length; j++) {
// 				System.out.print(array3[i][j] + " ");
// 			}
// 			System.out.println();
// 		}
// 		System.out.println();
		print2DArray(array3);
		
		
		System.out.println("4. +자 그리기");
		int[][] array4 = new int[5][5];
		
		for (int i = 0; i < array4.length; i++) {
			for (int j = 0; j < array4[i].length; j++) {
				array4[i][j] = 0;
				if (i == 2 || j == 2) {
					array4[i][j] = 1;
				}
			}
		}
		
// 		for (int i = 0; i < array4.length; i++) {
// 			for (int j = 0; j < array4[i].length; j++) {
// 				System.out.print(array4[i][j] + " ");
// 			}
// 			System.out.println();
// 		}
// 		System.out.println();
		print2DArray(array4);
		
		
		System.out.println("5. 전체 수 입력");
		int[][] array5 = new int[3][3];
		
		int num = 1;
		for (int i = 0; i < array5.length; i++) {
			for (int j = 0; j < array5[i].length; j++) {
				array5[i][j] = num++;
			}
		}
		
// 		for (int i = 0; i < array5.length; i++) {
// 			for (int j = 0; j < array5[i].length; j++) {
// 				System.out.print(array5[i][j] + " ");
// 			}
// 			System.out.println();
// 		}
// 		System.out.println();
		print2DArray(array5);
		
		
		System.out.println("6. 전체 수 입력");
		int[][] array6 = new int[3][3];
		
// 		for (int i = 0; i < array6.length; i++) {
// 			num = i + 1;	
// 			for (int j = 0; j < array6[i].length; j++) {
// 				array6[i][j] = num;
// 				num += 3;
// 			}
// 		}
		
		// 다른 풀이
		num = 1;
		for (int i = 0; i < array6.length; i++) {
			for (int j = 0; j < array6[i].length; j++) {
				array6[j][i] = num++;
			}
		}
		
// 		for (int i = 0; i < array6.length; i++) {
// 			for (int j = 0; j < array6[i].length; j++) {
// 				System.out.print(array6[i][j] + " ");
// 			}
// 			System.out.println();
// 		}
		print2DArray(array6);
		
	}
}
