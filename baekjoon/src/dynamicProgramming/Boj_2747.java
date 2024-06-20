package dynamicProgramming;

import java.util.Scanner;

public class Boj_2747 {
		static int[] dptable;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		dptable=new int[n+1];
		
		for(int i=2; i<=n; i++) {
			dptable[i]=-1;
		}
		dptable[1]=1;
		dptable[0]=0;
		
		System.out.println(dp(n));
		

	}
	
	static int dp(int n) {
		if(dptable[n]!=-1) {
			return dptable[n];
		}
		return dptable[n]=dp(n-2)+dp(n-1);
		
	}

}
