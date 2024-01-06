import java.util.Scanner;
//hallow square;

public class pattern2 {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int b=scan.nextInt();
		for(int i=0;i<a;i++){
			for(int j=0;j<b;j++) {
				if(i==0||i==a-1||j==0||j==b-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		} 
	}

}


