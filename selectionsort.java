import java.util.*;
public class selectionsort {

	public static void main(String[] args) {
		
		      Scanner sc = new Scanner(System.in);
		      Random r = new Random();
		     // System.out.print("Enter size of an array : ");
		     // int l = sc.nextInt();
		      int l =100000;
		      int arr[] = new int[l];
		      System.out.println("Enter elements of array");
		      for(int i=0; i<l ; i++){
		        // System.out.print((i+1)+"  :  ");
		         arr[i] = r.nextInt(100000);
		      }
		      BubbleSort(arr);
		      print(arr);
		      
		      long startTime = System.nanoTime();
		     // selectionSort(arr);
		    //  b.bubble_Sort(arr); 
		      in.sort(arr);
		      long endTime = System.nanoTime();
		      double t = (endTime - startTime)/1000000000.0;
		      System.out.println("Took "+t+ " s"); 
		    
		      
		      for(int i=0; i<l ; i++){
		         System.out.print(arr[i]+"  ");
		      }
		      
		      
		      
		   }
		   public static void selectionSort(int[] arr){
		      int l = arr.length;
		      for(int i=0; i<l-1 ; i++){
		         int a = min(i,l,arr);
		         int temp = arr[a]; 
		         arr[a] = arr[i]; 
		         arr[i] = temp;
		      }
		   }
		   public static int min(int n , int l , int[] arr){
		      int a = n; 
		      for (int j = n+1; j < l; j++) 
		          if (arr[j] < arr[a]) 
		              a = j;
		      return a;
		   }
		public static void BubbleSort(int arr[])
		{
			for(int i = 0; i < arr.length-1;i++)
			{
				for(int j = i+1; j < arr.length;j++) {
					if (arr[j] < arr[i]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
						
					}
				}
			}
		}
		public static void print(int arr[]) {
			for(int i = 0; i < arr.length;i++) {
				System.out.println(arr[i] + "");
			}
		}

	}
