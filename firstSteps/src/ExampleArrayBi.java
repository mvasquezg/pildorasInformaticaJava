
public class ExampleArrayBi {

	public static void main(String[] args) {
		double accumulated=0;
		double interest=0.10;
		
		double[][] balance=new double[6][5];
		
		for(int i=0; i<6; i++) {
			
			balance[i][0]=10000;
			accumulated=10000;
			
			for(int j=1; j<5; j++) {
				accumulated=accumulated+(accumulated*interest);
				
				balance[i][j]=accumulated; 
			}
			interest=interest+0.01;
		}
		
		
		for(int x=0; x<6; x++) {
			
			for(int y=1; y<5; y++) {
				System.out.printf("%1.2f ", balance[x][y]); 
			}
			System.out.println();
		}
		
		

	}

}
