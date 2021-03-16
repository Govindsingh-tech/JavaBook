
public class Shuffle {

	public static void main(String[] args) {
			int x = 3;
			while (x>0) {
			if (x>2) {
				System.out.println("a");
				System.out.println("-");
				x = x - 1;
			}
			if (x==2) {
				System.out.println("b c");
				System.out.println("-");
				x = x-1;
			}
			if(x==1) {
				System.out.println("d");
				x = x-1;
			}

	}
			
}
}