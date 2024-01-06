import java.util.Scanner;

public class Pattern17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int count=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=(n-i);j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				if(count<=9) {
					if(j%2!=0) {
					System.out.print("0"+count);
					count++;
					}
					else {
						System.out.print(" ");
					}
				}
				else {
					if(j%2!=0) {
						System.out.print(count);
						count++;
						}
				    else {
							System.out.print(" ");
						}
				}
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<2*(n-i);j++) {
				if(j%2!=0) {
					System.out.print(count);
					count++;
				}
				else {
				System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		
		

	}

}
