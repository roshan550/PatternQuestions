import java.util.Scanner;

public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int count=2;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(count<=9) {
					System.out.print("0"+count+" ");
					count+=2;
				}
				else {
					System.out.print(count+" ");
					count+=2;
				}
			}
			System.out.println();
		}

	}

}
