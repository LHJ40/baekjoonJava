import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_13305 {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		int[] length=new int[T-1];
		int[] price=new int[T];
		StringTokenizer st= new StringTokenizer(br.readLine());
		for(int i=0; i<T-1; i++) {
			length[i]=Integer.parseInt(st.nextToken());
		}
		st= new StringTokenizer(br.readLine());	
		for(int i=0; i<T; i++) {
			price[i]=Integer.parseInt(st.nextToken());
		}
		int minPrice=price[0];              
		long sum=0;
		for(int i=0; i<T-1; i++) {
				if(minPrice>price[i]) {
					minPrice=price[i];
				}
				sum+=(long)minPrice*length[i];
		}
		System.out.println(sum);
		
		
	}

}
