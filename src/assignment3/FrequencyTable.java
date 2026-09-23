
import java.util.Scanner;

public class FrequencyTable {
    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        System.out.println("How many die would you like to roll?");
        int d = in.nextInt();
        int[] sums = new int[(d*6)+1];

        for(int i=0; i<10000; i++){
            int rollSum  = 0;
            for(int r=0; r<d; r++){
                int s = (int)(Math.random()*6+1);
                rollSum= rollSum+s;  
            } 
            sums[rollSum]++;
        }

        System.out.println(" Times each value was rolled with " + d +  " dice over 10000 rolls:");
        for(int i=d;i<(d*6)+1; i++ ){
            System.out.print( i+ " : " + sums[i] + ", ");
        }
    }
}
