import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=scan.nextInt();
		int count=n*n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(count<=9) {
					System.out.print("0"+count+" ");
					count--;
				}
				else {
					System.out.print(count+" ");
					count--;
				}
			}
			System.out.println();
		}
		scan.close();

	}

}
