package dynamicProgramming;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_24416 {
	static int recursionCount;
	static int dpCount;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int[] f=new int[n+1];
		fib(n);
		fibonacci(n,f);
		System.out.println(recursionCount);
		System.out.println(dpCount);
		
	}
	
	static int fib(int n) {
	    if (n == 1 || n == 2){
	    	recursionCount++;
	    return 1;
	    }
	    else return (fib(n - 1) + fib(n - 2));
	}
	
	static int fibonacci(int n ,int[]f) {
	    f[1]= 1;
	    f[2]= 1;
	    for (int i=3; i<=n; i++) {
	    	f[i] = f[i - 1] + f[i - 2];
	    	dpCount++;
	    	}    
	    return f[n];
	}

}
