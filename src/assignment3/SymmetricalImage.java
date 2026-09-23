import java.util.Scanner;

public class SymmetricalImage {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("How tall would you like the array to be?");
    int n = in.nextInt();
    System.out.println("How wide would you like the array to be?");
    int m = in.nextInt();

    boolean[][] array = new boolean[n][m];
    for(int i = 0; i < (n*m/4); i++){
        int r = (int)(Math.random()*n);
        int c = (int)(Math.random()*m);
        int cM = (m-1-c);
        array[r][c] = true;
        array[r][cM] = true; 
    }

    for(int i=0; i<n; i++){
        for(int j = 0; j<m; j++){
            if(array[i][j] == true){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println("");
    }
}
}
