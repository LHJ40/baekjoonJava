package dynamicProgramming;

import java.util.Scanner;

public class Boj_11726 {
	static int[] dptable;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		dptable=new int[1001];
		
		dptable[1]=1;
		dptable[2]=2;
		
		System.out.println(dp(n));
		
	}
	
	static int dp(int n) {
		if(dptable[n]!=0) {
			return dptable[n];
		}
		return dptable[n]=(dp(n-2)+dp(n-1))%10007;
		//(A+B) % C = (A%C + B%C) % C
		//모듈러 연산 법칙

	}

}
