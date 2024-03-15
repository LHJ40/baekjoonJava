import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Boj_11399 {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list= new ArrayList<>();
		int N= Integer.parseInt(br.readLine());
		StringTokenizer st= new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			int n=Integer.parseInt(st.nextToken());
			list.add(n);
		}
		Collections.sort(list);
		int sum=0;
		for (int i=1; i<N; i++) {
			list.set(i,list.get(i-1)+list.get(i));
		}
		for (Integer integer : list) {
			sum+=integer;
		}
		System.out.println(sum);
		
	}

}
