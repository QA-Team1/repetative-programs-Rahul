
public class Hallowpyramid {

	public static void main(String[] args) {
		for(int row=1;row<=5;row++) {
			for(int space=row;space<=5;space++) {
				System.out.print(" ");
			}
			for(int col=1;col<row*2;col++) {
				
				if(col==1 ||col==row*2-1|| row==5)
				
				System.out.print("*");
				else
					System.out.print(" ");
				}
			System.out.println();
			}
	}
	}
