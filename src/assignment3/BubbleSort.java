import java.util.Scanner;

public class BubbleSort {
	
	public static void main(String[] args) {
		System.out.println("how big would you like for the array to be?");
        Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        int array[] = new int[n]; 
        
        System.out.println("what values would you like in the array?");
        
        for(int i=0; i<n; i++){
            array[i] = in.nextInt();
            System.out.println();
        }
        System.out.print("your integers are " ); 
        
        for(int a=0;a<n; a++){
          System.out.print(array[a]+" " );  
        }  
        System.out.println(" ");

        for(int i=0; i<n;i++){
            for(int j=1; j<n-i; j++ ){
                if(array[j-1] > array[j]){
                    int temp = array[j-1];
                    array[j-1] = array[j];
                    array[j]= temp; 
                }
            }
        }
        System.out.print(
            "your sorted array is: "
        );
	for(int p=0; p<n; p++){
            System.out.print(array[p]+" ");
        }
    }
}
