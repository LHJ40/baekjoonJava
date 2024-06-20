package dynamicProgramming;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_24416 {
	static int recursionCount;
	static int recursionCount2;
	static int dpCount;
	static int[] f2;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int[] f=new int[n+1];
		f2=new int[n+1];
		for(int i=0; i<=n; i++) {
			f2[i]=-1;
		}
		f2[1]=1;
		f2[2]=1;
		fib(n);
		dpfib(n);
		fibonacci(n,f);
		System.out.println(recursionCount);
		System.out.println(recursionCount2);
		System.out.println(dpCount);
		
	}
	
	static int fib(int n) {
	    if (n == 1 || n == 2){
	    	recursionCount++;
	    return 1;
	    }
	    else return (fib(n - 1) + fib(n - 2));
	}
	static int dpfib(int n) { //탑 다운
	    if (f2[n]!=-1){
	    	return f2[n];
	    }
	    recursionCount2++;
	    return f2[n]=dpfib(n - 2) + dpfib(n - 1);
	}
	
	static int fibonacci(int n ,int[]f) { //바텀 업
	    f[1]= 1;
	    f[2]= 1;
	    for (int i=3; i<=n; i++) {
	    	f[i] = f[i - 1] + f[i - 2];
	    	dpCount++;
	    	}    
	    return f[n];
	}

}
