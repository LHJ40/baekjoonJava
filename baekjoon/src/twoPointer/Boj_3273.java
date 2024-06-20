package twoPointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_3273 {

	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		StringTokenizer st= new StringTokenizer(br.readLine());
		int x=Integer.parseInt(br.readLine());
		
		int arr[]=new int[1000001];
		for(int i=0; i<n; i++) {
			int j=Integer.parseInt(st.nextToken());
			arr[j]=j;
		}
		
		int count=0;
		int i=1;
		int j=1000000;

		while(i<j) {
			if(arr[i]==0) {
				i++; continue;
			}
			if(arr[j]==0) {
				j--; continue;
			}
			if(arr[i]+arr[j]==x) {
				count++;
				i++; j--;
			}else if(arr[i]+arr[j]>x) {
				j--;
			}else {
				i++;
			}
		}
		System.out.println(count);

	}

}
