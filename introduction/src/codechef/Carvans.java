package codechef;

import java.util.Scanner;

public class Carvans {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int t= s1.nextInt();
		while(t-->0){
		    int n =s1.nextInt();
		    int[] arr =new int[n];
		    for(int i=0;i<n;i++){
		        arr[i] = s1.nextInt();
		    }
		    int count =1;
		    for(int i=0;i<n-1;i++){
		        if(arr[i+1]>arr[i]){
		            arr[i+1] =arr[i];
		        }
		        else{
		            count++;
		        }
		    }
		    System.out.println(count);
		}
	}

}
