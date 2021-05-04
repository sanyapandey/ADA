import java.io.*;
import java.util.*;

public class ArrayQ4 {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = scn.nextInt();
            }
        }
        
        
        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                for(int k=i+1;k<n;k++){
                    if(arr[k][j]<arr[i][j]){
                        int temp = arr[k][j];
                        arr[k][j] = arr[i][j];
                        arr[i][j] = temp;
                    }
                }
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
        
    }

}