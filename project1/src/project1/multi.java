package project1;

public class multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first[][] = { { 1, 8, 2}, { 5, 4, 3} };
		int second[][] = { {3, 7, 9}, {6, 4, 2} };
		//making two matrices which will be added the top six added to the bottom 6
		int result[][] = new int[2][3];
		//the result will be whatever the additions of the two matrices are
		for (int i=0; i<2; i++) {
			for (int j = 0; j<3; j++) {
				result[i][j] = first[i][j] + second[i][j];
				System.out.print(result[i][j]+ " ");
			}
			// loop adds the two matrices together and then displays results
		}

	}

}
