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
	int M=Integer.parseInt(st.nextToken());
	long prefix[]=new long[N+1];
	long rest[]=new long[M];
	
	 st= new StringTokenizer(br.readLine());
	 
	 long sum=0;
	 for(int i=1; i<=N; i++) {
		 prefix[i]=prefix[i-1]+Integer.parseInt(st.nextToken());	
		 rest[(int)(prefix[i]%M)]++;
		 if((int)(prefix[i]%M)==0) {		 
			 sum++;
		 }	 
	 }
	 for(int i=0; i<M; i++) {
		 sum+=rest[i]*(rest[i]-1)/2; 
		 
	 }
	 System.out.println(sum);
	
	}

}
