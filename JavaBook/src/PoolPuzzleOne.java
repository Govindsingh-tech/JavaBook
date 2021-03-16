
public class PoolPuzzleOne {

	public static void main(String[] args) {
		int x = 0;
		while (x<1) {
			System.out.println("a");
			x = x+1;
		}if (x<1) {
			x = x-1;
		}
		System.out.println("noise");
		
		if(x>0) {
			System.out.println("annoys");
			x = x-2;
		}if(x==1) {
			x = x+2;
		}System.out.println("an");
		if (x>3) {
			System.out.println(" ");
			
		}System.out.println("oyster");
	}

}
