import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		int m=2;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				
					System.out.print(m+" ");
					m+=2;
				
			}
			System.out.println();
			
		}

	}

}
