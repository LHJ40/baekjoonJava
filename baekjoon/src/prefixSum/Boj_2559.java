package prefixSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_2559 {
	public static void main(String[] args) throws IOException {
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st= new StringTokenizer(br.readLine());
	
	int N=Integer.parseInt(st.nextToken());
	int K=Integer.parseInt(st.nextToken());
	int prefix[]=new int[N+1];
	
	 st= new StringTokenizer(br.readLine());
	 
	 for(int i=1; i<=N; i++) {
		 prefix[i]=prefix[i-1]+Integer.parseInt(st.nextToken());	 
	 }
	 
	 int b=0;
	 int Max=Integer.MIN_VALUE;
	 for(int i=K; i<=N; i++) {
		 if(prefix[i]-prefix[i-K]>Max) {
			 Max=prefix[i]-prefix[i-K];
			 
		 }	 
	 }
	 System.out.println(Max);
	 
	}

}
