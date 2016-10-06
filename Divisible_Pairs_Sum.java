import java.util.Scanner;


public class Divisible_Pairs_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int k=scn.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i]=scn.nextInt();
		}
		int count=0;
		
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if((arr[i]+arr[j])%3==0){
				count=count+1;	
				}
			}
		}
		System.out.println(count);
	}

}
