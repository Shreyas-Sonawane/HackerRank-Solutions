import java.io.*;
import java.util.*;

public class Birthday_candles {

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar,int n) {

    	int max=0 , count=0;
    		
    	for(int i=0 ; i<n ; i++)
    	{
    		if(ar[i]>max)
    			max=ar[i];
    	}
    	
    	for(int i=0 ; i<n ; i++)
    	{
    		if(ar[i]==max)
    			count++;
    	}
    	
    	
    	return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        
    	BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[arCount];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < arCount; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = birthdayCakeCandles(ar,arCount);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
