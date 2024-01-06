import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		char ch=scan.next().charAt(0);
		for(int i=0;i<n;i++) {
			System.out.println(ch);
		}
		scan.close();

	}

}
