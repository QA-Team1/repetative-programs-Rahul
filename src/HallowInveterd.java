
public class HallowInveterd {

	public static void main(String[] args) {
	for(int j=1;j<=5;j++) {
		for(int i=5;i>=j;i--) {
			if(i==1||i==5||j==1||i==j)
			System.out.print("*");
			else
				System.out.print(" ");
		}
		System.out.println();
		
		
	}

	}

}
