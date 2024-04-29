import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class temp {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int T=Integer.parseInt(br.readLine());
		
		while(T-->0) {
			int N=Integer.parseInt(br.readLine());
			int arr[]=new int[N];
			StringTokenizer st=new StringTokenizer(br.readLine());
			for(int i=0; i<N; i++) {
				arr[i]=Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);
			int sum=0;
			for(int i=N-1; i>=0; i--) {
				if(arr[i]==0) {continue;}
				sum+=arr[i];
				int max=arr[i];
				for(int j=i-1; j>=0; j--) {
					if(arr[j]<max&&arr[j]!=0) {
						arr[j]=0;
						break;
					}
				}
				
			}
			System.out.println(sum);
			
		}

	}

}
