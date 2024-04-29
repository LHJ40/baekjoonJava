import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Temp2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb= new StringBuilder();
		int T=10;
		while(T-->0) {
			int N=Integer.parseInt(br.readLine());
			int arr[]=new int[101];
			StringTokenizer st= new StringTokenizer(br.readLine());
			for(int i=1; i<=100; i++) {
				arr[Integer.parseInt(st.nextToken())]++;
				
			}
			int Max=0;
			int Min=0;
			while(N-->0) {
			for(int i=100; i>0; i--) {
				if(arr[i]!=0) {
					arr[i]--;
					arr[i-1]++;
					Max=i;
					break;
				}
			}
			for(int i=1; i<=100; i++) {
				if(arr[i]!=0) {
					arr[i]--;
					arr[i+1]++;
					Min=i;
					break;
					
				}
			}
			if(Max-Min==0) {break;}
			}
			for(int i=100; i>0; i--) {
				if(arr[i]!=0) {
					Max=i;
					break;
				}
			}
			for(int i=1; i<=100; i++) {
				if(arr[i]!=0) {
					Min=i;
					break;
					
				}
			}
			
			sb.append("#").append(10-T).append(" ").append(Max-Min).append("\n");
		}
		System.out.println(sb);

	}

}
