import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Boj_11047 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer(br.readLine());
		List<Integer> list= new ArrayList<>();
		int N= Integer.parseInt(st.nextToken());
		int K= Integer.parseInt(st.nextToken());
		int sum=0;
		for(int i=0; i<N; i++) {
			int n=Integer.parseInt(br.readLine());
			if(n>K)break;
			list.add(n);
		}
		for(int i=list.size()-1; i>=0; i--) {
			int n=list.get(i);
			sum+=K/n;
			K%=n;
		}
		System.out.println(sum);
		
	}

}
