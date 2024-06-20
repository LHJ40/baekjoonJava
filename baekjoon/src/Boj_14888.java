import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_14888 {
	static int[] number;
	static int[] operator=new int[4];
	static int N;
	static int Max=Integer.MIN_VALUE;
	static int Min=Integer.MAX_VALUE;
	

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		N=Integer.parseInt(br.readLine());
		StringTokenizer st= new StringTokenizer(br.readLine());
		number=new int[N];
		for(int i=0; i<N; i++) {
			number[i]=Integer.parseInt(st.nextToken());
		}
		st= new StringTokenizer(br.readLine());
		for(int i=0; i<4; i++) {
			operator[i]=Integer.parseInt(st.nextToken());
		}
		
		dfs(number[0],1);
		
		System.out.println(Max);
		System.out.println(Min);
		

	}
	
	static void dfs(int num, int idx) {
		
		if(idx==N) {
			Max=Math.max(num,Max);
			Min=Math.min(num,Min);
			return;
		}
		
		for(int i=0; i<4; i++) {
			if(operator[i]>0) {
				operator[i]--;
				switch (i) {
				case 0: dfs(num+number[idx], idx+1);break;
				case 1: dfs(num-number[idx], idx+1);break;
				case 2: dfs(num*number[idx], idx+1);break;
				case 3: dfs(num/number[idx], idx+1);break;
				
				}
				operator[i]++;
			}
				
		}
		
	}

}
