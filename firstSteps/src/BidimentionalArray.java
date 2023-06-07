
public class BidimentionalArray {

	public static void main(String[] args) {
		/*int[][] arrayBi=new int[4][5];
		
		arrayBi[0][0]=15;
		arrayBi[0][1]=21;
		arrayBi[0][2]=18;
		arrayBi[0][3]=9;
		arrayBi[0][4]=15;
		
		arrayBi[1][0]=10;
		arrayBi[1][1]=52;
		arrayBi[1][2]=17;
		arrayBi[1][3]=19;
		arrayBi[1][4]=7;
		
		arrayBi[2][0]=19;
		arrayBi[2][1]=2;
		arrayBi[2][2]=19;
		arrayBi[2][3]=17;
		arrayBi[2][4]=7;
		
		arrayBi[3][0]=92;
		arrayBi[3][1]=13;
		arrayBi[3][2]=13;
		arrayBi[3][3]=32;
		arrayBi[3][4]=41;
		
		//System.out.println(arrayBi[2][3]);*/
		
int[][] arrayBi= {
				{15,21,18,9,15},
				{10,52,17,19,7},
				{19,2,19,17,7},
				{92,13,13,32,41}
			};
		
		
		/*for(int i=0; i<4; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(arrayBi[i][j]+" ");
			}
			System.out.println();
		}*/

		for(int[] row: arrayBi) {
			for(int z: row) {
				System.out.print(z+" ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
