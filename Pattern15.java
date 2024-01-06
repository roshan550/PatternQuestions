import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int count=3;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				
				System.out.print(count+" ");
				count+=3;
			}
			System.out.println();
		}

	}

}
