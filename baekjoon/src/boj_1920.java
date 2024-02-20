import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_1920 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(br.readLine());
		StringTokenizer st= new StringTokenizer(br.readLine());
		int arr[]=new int[N];
		
		while(N-->0) {
			arr[N]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int M=Integer.parseInt(br.readLine());
		st= new StringTokenizer(br.readLine());
		while(M-->0) {
			binarysearch(arr,Integer.parseInt(st.nextToken()));
		}
		
	}
	
	static void binarysearch(int arr[],int key) {
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]>key) {
				high=mid-1;
			}else if(arr[mid]<key){
				low=mid+1;
			}else {
				System.out.println(1);
				return;
			}			
		}
		System.out.println(0);
		
	}

}
