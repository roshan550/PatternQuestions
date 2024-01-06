import java.util.Scanner;

public class Patrren13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	    int n=scan.nextInt();
	    int count=1;
	    for(int i=1;i<=n;i++) {
	    	for(int j=1;j<=n;j++) {
	    		if(count<=9) {
	    		System.out.print("0"+count+" ");
	    		count++;
	    		}
	    		else {
	    			System.out.print(count+" ");
		    		count++;
	    		}
	    	}
	    	
	    	System.out.println();
	    }
	    scan.close();

	}

}

