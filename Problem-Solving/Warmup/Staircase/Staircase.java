
import java.util.*;

public class Staircase {

    // Complete the staircase function below.
    static void staircase(int n) {
    	int m=n-1;
    	String space= new String (" ");
    	String hash= new String ("#");
    	for(int i=0; i<n ; i++)
    	{
    		for(int j=m;j>=0;j--)
    			System.out.print(space);
    		for(int k=0;k<=i;k++)
    			System.out.print(hash);
    			
    		System.out.println();
    		m=m-1;
    	}

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
