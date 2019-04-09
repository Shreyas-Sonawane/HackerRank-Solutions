
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;


public class Grading_Students {
    /*
     * Complete the gradingStudents function below.
     */
    static int[] gradingStudents(int[] grades, int n) {
		
        /*
         * Write your code here.
         */
    	 for (int i=0; i<n ; i++)
         {
                 int mul=1;
                 if(grades[i]>=38)
                 {
                     for(int j=1 ; ; j++)
                     {
                         mul=j*5;
                         if(grades[i]<mul)
                             break;
                     }
                     int res= mul-grades[i];
                     if(res <3)
                     {
                         grades[i]=mul;
                     }
                 }
         }
         
         return grades;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            int gradesItem = Integer.parseInt(scan.nextLine().trim());
            grades[gradesItr] = gradesItem;
        }

        int[] result = gradingStudents(grades , n );

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            bw.write(String.valueOf(result[resultItr]));

            if (resultItr != result.length - 1) {
                bw.write("\n");
            }
        }

        bw.newLine();

        bw.close();
    }
}
