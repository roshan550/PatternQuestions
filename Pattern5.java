import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		char ch=scan.next().charAt(0);
		for(int i=0;i<n;i++) { 
			for(int j=0;j<m;j++) {
			System.out.print(ch);
			}
			System.out.println();
		}
		scan.close();

	

	}

}
