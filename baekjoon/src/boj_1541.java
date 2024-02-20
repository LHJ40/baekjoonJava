import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1541 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(),"-");
		boolean start=true;
		int sum=0;
		while(st.hasMoreTokens()) {
			StringTokenizer st2 = new StringTokenizer(st.nextToken(),"+");
			int add=0;
			while(st2.hasMoreTokens()) {
				add+=Integer.parseInt(st2.nextToken());
			}
			if(start) {
				sum+=add;
			}else {
				sum-=add;
			}
			start=false;
		}
		System.out.println(sum);

	}

}
