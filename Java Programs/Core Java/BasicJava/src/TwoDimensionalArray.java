
public class TwoDimensionalArray {

	public static void main(String[] args) {
		int num[][]= 
			{
				{1,2,3},
				{4,5,6},
				{7,8,9}
			};
		System.out.println("display 2 - D array");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
	}

}
