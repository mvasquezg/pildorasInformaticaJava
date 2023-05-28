
public class ArrayRandomNumber {

	public static void main(String[] args) {
		int[] arrayRandomNumber=new int[150];
		
		for(int i=0; i<arrayRandomNumber.length; i++) {
				arrayRandomNumber[i]=(int) Math.round(Math.random()*100);
		}
		
		for(int element: arrayRandomNumber) {
			System.out.print(element+" ");
		}
		System.out.println();
	}

}
