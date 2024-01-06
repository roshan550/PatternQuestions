import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int count=1;
		int out=2;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i%2==0) {
					if(count<=9) {
					System.out.print("0"+count+" ");
					count+=2;
					}
					else {
						System.out.print(count+" ");
						count+=2;
					}
				}
				else {
					if(out<=9) {
					System.out.print("0"+out+" ");
					out+=2;
					}
					else{
						
						System.out.print(out+" ");
						out+=2;
					}
				}
			}
			System.out.println();
		}

	}

}
