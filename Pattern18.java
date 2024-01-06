import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int count=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i%2!=0) {
					System.out.print(count+" ");
					if(j!=n) {
					count++;
					}
				}
				else {
					System.out.print(count+" ");
					if(j!=n) {
					count--;
					}
				}
			}
			count+=n;
			System.out.println();
		}

	}

}
