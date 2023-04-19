package array;
//two Matrices Addition - 3*3
public class AdditionArrayThreeM {
	public static void main(String[] args)
	{
		int a [][]= {{1,2,3},{4,5,6},{5,1,2}};
		int b[][]={{1,5,3},{4,2,1},{1,1,2}};
		int d[][]={{2,2,5},{4,5,9},{8,9,9}};
		
		//for storing result creating another matrix
		int c[][]=new int [3][3]; // three row three column
		// logic and printing
		for( int i =0; i<3;i++) {//printing row
			for( int j =0; j<3;j++) {//printing column
				c[i][j]=a[i][j]+b[i][j]+d[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
//Three Matrices Multiplication in Array-- 3*3
