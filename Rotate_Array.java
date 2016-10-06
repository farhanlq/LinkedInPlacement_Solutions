import java.util.Scanner;


public class Rotate_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of elements");
		Scanner scn=new Scanner(System.in);
		int N=scn.nextInt();
		int A[]=new int[N];
		System.out.println("Enter the rotations");
		int K=scn.nextInt();
		for(int i=0;i<A.length;i++){
			A[i]=scn.nextInt();
			
		}
		
		int B[]=new int[N];
		//System.out.println();
		for(int i=0;i<A.length;i++){
			B[i]=A[(i+K)%N];
					}
		for(int j=0;j<B.length;j++){
			System.out.print(B[j]+" ");
		}
		
				
		
	}

}
