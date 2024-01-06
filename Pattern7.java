import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		char ch=scan.next().charAt(0);
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
			System.out.print(ch);
		}
			System.out.println();
		scan.close();

	}

	}

}
