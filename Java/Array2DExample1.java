package basic;

public class Array2DExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix=new int[2][3];
		matrix[0][0]= 1;
		matrix[0][1]= 2;
		matrix[0][2] =3;
		matrix[1][0]=11;
		matrix[1][1]=22;
		matrix[1][2]=303;
//		System.out.println(matrix[0][0]);
//		System.out.println(matrix[1][2]);
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(matrix[i][j]);
			}
		}

	}

}
